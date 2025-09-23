package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection getConexion() {
        Connection conexion = null;
        var baseDatos = "zone_fit_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos + "?useSSL=false&serverTimezone=UTC";
        var usuario = "root";
        var password = "admin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("✅ Conexión exitosa a la base de datos");
        } catch (Exception e) {
            System.out.println("❌ Error al conectar a la base de datos:");
            e.printStackTrace();
        }

        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null) {
            System.out.println("✔ Prueba de conexión OK");
        } else {
            System.out.println("✘ No se pudo establecer la conexión");
        }
    }
}
