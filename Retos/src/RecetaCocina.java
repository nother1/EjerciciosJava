
import  java.util.Scanner;
public class RecetaCocina {
    public static void main(String[] args) {
        String nombreReceta,ingredientesPrincipales,dificultadReceta;
        int tiempoPreparacion;

        Scanner consola = new Scanner(System.in);

        System.out.println("*** Receta de Cocina ***");
        System.out.println();
        System.out.print("Ingrese el nombre de la receta: ");
        nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes separados por ,: ");
        ingredientesPrincipales = consola.nextLine();
        System.out.print("Ingrese tiempo de preparacion: ");
        tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Cual es la dificultad (Facil, Media, Alta): ");
        dificultadReceta = consola.nextLine();

        System.out.println();
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesPrincipales);
        System.out.println("Tiempo Preparacion (min): " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultadReceta);

        consola.close(); // buena práctica, cerrar el Scanner
    }
}
