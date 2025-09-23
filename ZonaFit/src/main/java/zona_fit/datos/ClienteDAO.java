package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDAO implements IClienteDAO{
    @Override
    public List<Cliente> listarCliente() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        var sql = "SELECT * FROM cliente ORDER BY idcliente";
        try {
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
                var cliente = new Cliente();
                cliente.setIdcliente(rs.getInt("idcliente")) ;
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMenbresia(rs.getInt("menbresia"));
                clientes.add(cliente);
           }
        } catch (Exception e) {
            System.out.println("Error a listar Clientes " + e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (SQLException e) {
                System.out.println("Error a cerrar conexion: " + e.getMessage());
            }

        }
        return  clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql = "SELECT * FROM cliente WHERE idcliente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getIdcliente());
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMenbresia(rs.getInt("menbresia"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al capturar cliente por id " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (Exception e) {
                System.out.println("Error a cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        var con = getConexion();
        String sql = "INSERT INTO cliente(nombre,apellido,menbresia) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());;
            ps.setString(2,cliente.getApellido());;
            ps.setInt(3,cliente.getMenbresia());;
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error a insertar : " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (Exception e) {
                System.out.println("Error a cerrar conexion: " + e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean modificarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        var con = getConexion();
        var sql = "UPDATE cliente SET nombre = ? , apellido = ?, menbresia = ? " +
                "WHERE idcliente = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMenbresia());
            ps.setInt(4, cliente.getIdcliente());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error a modificar : " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (Exception e) {
                System.out.println("Error a cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        var con = getConexion();
        var sql = "DELETE FROM cliente where idcliente = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,cliente.getIdcliente());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error a eliminar cliente: " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (Exception e) {
                System.out.println("Error a cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var clienteDAO = new ClienteDAO();
       /*
        */

        // Buscar id
       /* var cliente1 = new Cliente(1);
        System.out.println("cliente antes de la busquedad: " + cliente1);
        var encontrado = clienteDAO.buscarClientePorId(cliente1);
        if(encontrado)
            System.out.println("Se encontro el registro " + cliente1);
        else
            System.out.println("No se econtro el registro" + cliente1.getIdcliente());*/

       /* var cliente = new Cliente("Dante","Perez",300);
        var insertado = clienteDAO.agregarCliente(cliente);
        if(insertado)
            System.out.println("Se encontro el registro " + cliente);
        else
            System.out.println("No se econtro el registro" + cliente.getIdcliente());
        var clientes = clienteDAO.listarCliente();
        clientes.forEach(System.out::println);*/


       /* var cliente = new Cliente(3,"Dante","Nephlin",301);
        var modificarCLiente = clienteDAO.modificarClientePorId(cliente);
        if(modificarCLiente)
            System.out.println("Cliente modificado " + modificarCLiente);
        else
            System.out.println("no se modificado cliente " + modificarCLiente);
        var clientes2 = clienteDAO.listarCliente();
        clientes2.forEach(System.out::println);*/

        /*var cliente = new Cliente(3,"Dante","Nephlin",301);
        var eliminarCLiente = clienteDAO.eliminarClientePorId(cliente);
        if(eliminarCLiente)
            System.out.println("Cliente eliminado " + eliminarCLiente);
        else
            System.out.println("no se elimino cliente " + eliminarCLiente);
        var clientes2 = clienteDAO.listarCliente();
        clientes2.forEach(System.out::println);*/
    }
}
