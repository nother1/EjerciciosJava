import java.util.Scanner;

public class areaRectangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        double baseRectangulo, alturaRectangulo, perimetroRectungulo, areaRectangulo;
        System.out.println("*** Area de un rectangulo ***");
        System.out.print("Base del rectangulo: ");
        baseRectangulo = consola.nextDouble();
        System.out.print("Altura del rectangulo: ");
        alturaRectangulo = consola.nextDouble();
        areaRectangulo = baseRectangulo * alturaRectangulo;
        perimetroRectungulo = baseRectangulo + alturaRectangulo;
        perimetroRectungulo *= 2;
        System.out.println();
        System.out.println("""
                Datos Obtorgados
                    Base %.2f
                    Altura %.2f
                    Area %.2f
                    Perimetro %.2f
                """.formatted(baseRectangulo,alturaRectangulo,areaRectangulo,perimetroRectungulo));
    }
}
