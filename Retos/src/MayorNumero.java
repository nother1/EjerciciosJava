import  java.util.Scanner;
public class MayorNumero {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("*** Mayor de dos numeros ***");
        System.out.print("Ingrese el primer numero: ");
        numero1 = consola.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = consola.nextInt();
        if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }else {
            var respuestaNumerica = Math.max(numero1, numero2);
            System.out.printf("""
                    *** Resultado ***
                        Entre el %d
                        y el %d
                        el mayor es %d
                    """, numero1,numero2, respuestaNumerica);
        }

    }
}
