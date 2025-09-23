package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitapp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        var clienteDao = new ClienteDAO();
        System.out.println("*** Zona Fit ***");
        do{
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Error al ejecutar Opciones " + e.getMessage());
            }
            System.out.println();
        }while (!salir);
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                1. Listar Clientes
                2. Buscar CLientes
                3. Agregar Cliennte
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elije una opcion: \s
                """);
        var option = Integer.parseInt(consola.nextLine());
        return  option;
    }

    private static boolean ejecutarOpciones(Scanner consola, int option, ClienteDAO clienteDao){
        var salir = false;
        switch (option) {
            case 1 -> {
                System.out.println("*** Listado de clientes ***");
                var clientes = clienteDao.listarCliente();
                clientes.forEach(System.out::println);

            }
            case 2 -> {
                System.out.println("*** Buscar  cliente ***");
                System.out.print("Ingrese el id del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var buscarCliente = clienteDao.buscarClientePorId(cliente);
                if(buscarCliente){
                    System.out.println("*** Cliente encontrado *** " + cliente);
                }else {
                    System.out.println("*** Cliente no encontrado *** " + cliente);
                }
            }
            case 3 -> {
                System.out.println("*** Agregar  cliente ***");
                System.out.print("Ingrese el nombre del cliente: ");
                var nombreCliente = consola.nextLine();
                System.out.print("Ingrese el apellido del cliente: ");
                var apellidoCliente = consola.nextLine();
                System.out.print("Ingrese la membresia del cliente: ");
                var menbresiaCliente = Integer.parseInt(consola.nextLine());
                var nuevoCliente = new Cliente(nombreCliente,apellidoCliente,menbresiaCliente);
                var agregado = clienteDao.agregarCliente(nuevoCliente);
                if(agregado){
                    System.out.println("*** Cliente agregado *** " + nuevoCliente);
                }else {
                    System.out.println("*** Cliente no agregado *** " + nuevoCliente);
                }

            }
            case 4 -> {
                System.out.println("*** Modificar  cliente ***");
                System.out.print("Ingrese el id del cliente a modificar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("Ingrese el nombre del cliente: ");
                var nombreCliente = consola.nextLine();
                System.out.print("Ingrese el apellido del cliente: ");
                var apellidoCliente = consola.nextLine();
                System.out.print("Ingrese la membresia del cliente: ");
                var menbresiaCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente,nombreCliente,apellidoCliente,menbresiaCliente);
                var modificarCliente = clienteDao.modificarClientePorId(cliente);
                if(modificarCliente){
                    System.out.println("*** Cliente modificado *** " + cliente);
                }else{
                    System.out.println("*** Cliente no modificado *** " + cliente);
                }

            }
            case 5 -> {
                System.out.println("*** Eliminar  cliente ***");
                System.out.print("Ingrese el id del cliente a eliminar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminarCliente = clienteDao.eliminarClientePorId(cliente);
                if(eliminarCliente){
                    System.out.println("*** Cliente eliminado *** " + cliente);
                }else{
                    System.out.println("*** Cliente no eliminado *** " + cliente);
                }
            }
            case 6 -> {
                System.out.println("hasta pronto");
                salir = true;
            }
            default -> {
                System.out.println("Option no valida");
            }
        }
        return salir;
    }
}
