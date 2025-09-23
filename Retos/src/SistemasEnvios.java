import  java.util.Scanner;
public class SistemasEnvios {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        String tipoDestino;
        double totalCarga,costoPaquete;
        System.out.println("*** Sistema de envios ***");
        System.out.print("Ingrese el tipo de destino (Nacional/Internacional): ");
        tipoDestino = consola.nextLine().toLowerCase();
        System.out.print("Ingrese el tamaño de la carga en kilos: ");
        totalCarga = consola.nextDouble();
        costoPaquete = (tipoDestino.equals("nacional")) ? 10 * totalCarga : (tipoDestino.equals("internacional")) ? 20 * totalCarga : 0 ;
        System.out.println("El costo del paquete es : " + costoPaquete );
    }
}
