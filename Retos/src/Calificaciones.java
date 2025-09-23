import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int notaExamen;
        System.out.println("*** Sistema de calificaciones *** ");
        System.out.print("Ingrese el valor de la nota: ");
        notaExamen = consola.nextInt();
        if(notaExamen > 0 && notaExamen < 6) System.out.println("Nota final: F");
        else if(notaExamen >= 6 && notaExamen < 7) System.out.println("Nota final: D");
        else if(notaExamen >= 7 && notaExamen < 8) System.out.println("Nota final: C");
        else if(notaExamen >= 8 && notaExamen < 9) System.out.println("Nota final: B");
        else if(notaExamen >= 9 && notaExamen == 10) System.out.println("Nota final: A");
        else System.out.println("Valor no valido");
    }
}
