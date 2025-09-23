import  java.util.Scanner;
public class ReservaHoteles2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        String nombreCliente,diasEstadia;
        boolean tieneVistaMar;

        System.out.println(" *** Sistema de recerva *** ");
        System.out.print("Nombre del CLiente: ");
        nombreCliente = consola.nextLine();
        System.out.print("Cuantos dias estara en el hotel: ");
        diasEstadia = consola.nextLine();
        System.out.print("Desea una habitacion con vista al Mar (S/N) ");
        var decision = consola.nextLine().toUpperCase();
        tieneVistaMar = (decision.equals(("S")));
        double precioTotal;
        precioTotal = (tieneVistaMar) ? 190.50 * Integer.parseInt(diasEstadia): 150.50 * Integer.parseInt(diasEstadia);
        System.out.println();
        System.out.printf("""
                *** Detalles de la recervacion ***
                    Cliente : %s
                    Dias de estadia : %s
                    Habitacion con vista al mar : %s
                    Costo toal: %.2f
                %n""", nombreCliente, diasEstadia, tieneVistaMar, precioTotal);
    }
}
