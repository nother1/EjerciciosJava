import java.util.Scanner;
public class SistemaAuteficacion2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final String USER = "Nother";
        final String PASSWORD = "1234567890";
        String userName,userPassword;
        System.out.println("*** Sistema Autetificacion ***");
        System.out.print("Ingrese su nombre de usuario: ");
        userName = consola.nextLine();
        System.out.print("Ingrese su contraseña: ");
        userPassword = consola.nextLine();

        if(userName.equals(USER) && userPassword.equals(PASSWORD)){
            System.out.println("Bienvenido al sistema");
        }else{
            if(!userName.equals(USER) && !userPassword.equals(PASSWORD)){
                System.out.println("Usuario y contraseña invalidos");
            }else if(userName.equals(USER) && !userPassword.equals(PASSWORD)){
                System.out.println("contraseña invalida");
            }
            else if(!userName.equals(USER) && userPassword.equals(PASSWORD)){
                System.out.println("Usuario invalida");
            }
        }
    }
}
