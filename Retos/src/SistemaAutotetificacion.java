import java.util.Scanner;
public class SistemaAutotetificacion {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final String USUARIO = "Nother";
        final String PASSWORD = "D4RKC07733";
        String userName,userPassword;
        boolean estanCorrectos;
        System.out.println("*** Sistema de auntetificacion ***");
        System.out.print("Cual es tu usuario: ");
        userName = consola.nextLine();
        System.out.print("Cual es tu password: ");
        userPassword = consola.nextLine();
        estanCorrectos = userName.equals(USUARIO) && userPassword.equals(PASSWORD);

        System.out.println("Datos Correcto: " + estanCorrectos);

    }
}
