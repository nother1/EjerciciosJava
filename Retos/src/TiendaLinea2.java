import java.util.Scanner;

public class TiendaLinea2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final int VALOR_DESCUENTO_TOTAL = 1000;
        int valorPagar, valorDescuento;
        double precioDescuento;
        boolean esMiembro;

        System.out.println("*** Tienda en línea con descuento ***");
        System.out.print("Valor total: ");
        valorPagar = consola.nextInt();
        System.out.print("¿Es miembro de la tienda (true/false)?: ");
        esMiembro = consola.nextBoolean();

        if (valorPagar >= VALOR_DESCUENTO_TOTAL && esMiembro) {
            valorDescuento = 10;
        } else if (valorPagar < VALOR_DESCUENTO_TOTAL && esMiembro) {
            valorDescuento = 5;
        } else {
            valorDescuento = 0;
        }

        // cálculo del descuento
        precioDescuento = valorPagar * (valorDescuento / 100.0);

        // salida
        if (valorDescuento > 0) {
            System.out.print("""
                Felicidades, has obtenido un descuento del %d %%
                    Total de la compra: %d
                    Total descuento: %.2f
                    Total a pagar: %.2f
                """.formatted(valorDescuento, valorPagar, precioDescuento, (valorPagar - precioDescuento)));
        } else {
            System.out.print("""
                No aplica descuento
                    Total de la compra: %d
                    Total descuento: %.2f
                    Total a pagar: %.2f
                """.formatted(valorPagar, precioDescuento, (valorPagar - precioDescuento)));
        }

        consola.close();
    }
}
