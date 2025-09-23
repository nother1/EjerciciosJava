import  java.util.Scanner;
public class estacionesAño {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int mesAnio;
        String estacionAnio = "";
        System.out.println("*** Estaciones del año ***");
        System.out.print("Ingrese el mes, de que quiera saber su estacion, de forma numerica: ");
        mesAnio = consola.nextInt();
        switch (mesAnio){
            case 1 -> estacionAnio = "Invierno";
            case 2 -> estacionAnio = "Invierno";
            case 3 -> estacionAnio = "Primavera";
            case 4 -> estacionAnio = "Primavera";
            case 5 -> estacionAnio = "Primavera";
            case 6 -> estacionAnio = "Verano";
            case 7 -> estacionAnio = "Verano";
            case 8 -> estacionAnio = "Verano";
            case 9 -> estacionAnio = "Otoño";
            case 10 -> estacionAnio = "Otoño";
            case 11 -> estacionAnio = "Otoño";
            case 12 -> estacionAnio = "Invierno";
            default -> System.out.println("Mes inccorrecto");
        }
        System.out.println("La estacion del mes selecionado es: " + estacionAnio);
    }
}
