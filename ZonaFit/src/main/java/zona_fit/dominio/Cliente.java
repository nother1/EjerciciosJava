package zona_fit.dominio;

import java.util.Objects;

public class Cliente {
    private  int idcliente, menbresia;
    private String nombre, apellido;

    public Cliente(){}
    public Cliente(int id){
        this.idcliente = id;
    }
    public Cliente(String nombre, String apellindo, int menbresia){
        this.nombre = nombre;
        this.apellido = apellindo;
        this.menbresia = menbresia;
    }
    public Cliente(int idcliente,String nombre, String apellindo, int menbresia){
       this(nombre,apellindo,menbresia);
       this.idcliente = idcliente;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getMenbresia() {
        return menbresia;
    }

    public void setMenbresia(int menbresia) {
        this.menbresia = menbresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idcliente=" + idcliente +
                ", menbresia=" + menbresia +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idcliente == cliente.idcliente && menbresia == cliente.menbresia && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcliente, menbresia, nombre, apellido);
    }
}
