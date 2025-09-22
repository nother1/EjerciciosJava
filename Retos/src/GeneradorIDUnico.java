
import java.util.Scanner;
import java.util.Random;
public class GeneradorIDUnico {
    public static void main(String[] args) {
        var random = new Random();
        var consola = new Scanner(System.in);

        String nombrePersona, apellidoPersona, anioNacimiento, idPersona;
        int numeroAletorio = random.nextInt(10000);
        System.out.println("*** Sistema de ID unico ***");
        System.out.print("Cual es tu nombre: ");
        nombrePersona = consola.nextLine();
        System.out.print("Cual es tu apellido: ");
        apellidoPersona = consola.nextLine();
        System.out.print("Cual es tu fecha de nacimiento: ");
        anioNacimiento = consola.nextLine();

        var nombreFormeado = nombrePersona.strip();
        nombreFormeado = nombreFormeado.substring(0,2);
        nombreFormeado = nombreFormeado.toUpperCase();
        var apellidoFormateo = apellidoPersona.strip();
        apellidoFormateo = apellidoFormateo.substring(0,2);
        apellidoFormateo = apellidoFormateo.toUpperCase();
        var anioFormateado = anioNacimiento.strip();
        anioFormateado = anioFormateado.substring(anioFormateado.length() - 2);
        var idFormateado = nombreFormeado+apellidoFormateo+anioFormateado+"%04d".formatted(numeroAletorio);
        var mensaje = """
                Hola %s %s
                    Tu nuevo numero de identificacion (ID) generado por el sistema es: 
                    Id Empleado: %s
                    Feliciades
                """.formatted(nombrePersona, apellidoPersona, idFormateado);
        System.out.println(mensaje);
    }
}
