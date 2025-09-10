public class ReservaHoteles {
    public static void main(String[] args) {
        String nombreCliente ="Pepito perez";
        int diasEstancia = 5;
        double tarifaDiaria = 7500.00;
        boolean tieneVistaMar = true;

        System.out.println("Nombre Cliente: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Tiene vista al mar: " + tieneVistaMar);

        nombreCliente = "Mandeline Jones";
        diasEstancia = 7;
        tarifaDiaria = 6000.50;
        tieneVistaMar = false;

        System.out.println();
        System.out.println("Nombre Cliente: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Tiene vista al mar: " + tieneVistaMar);

    }
}
