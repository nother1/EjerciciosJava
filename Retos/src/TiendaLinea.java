public class TiendaLinea {
    public static void main(String[] args) {
        String nombreProducto = "Curso de videojuegos";
        float precioProducto = 750.50F;
        int cantidadDispoble = 1;
        boolean estaDisponible = true;

        System.out.println("Nombre Proucto: " + nombreProducto);
        System.out.println("Precio Proucto: " + precioProducto);
        System.out.println("Cantidad dispoble: " + cantidadDispoble);
        System.out.println("Esta disponible: " + estaDisponible);

        nombreProducto = "Curso de inteligencia emocional";
        precioProducto = 850.95F;
        cantidadDispoble = 0;
        estaDisponible = false;
        System.out.println();
        System.out.println("Nombre Proucto: " + nombreProducto);
        System.out.println("Precio Proucto: " + precioProducto);
        System.out.println("Cantidad dispoble: " + cantidadDispoble);
        System.out.println("Esta disponible: " + estaDisponible);
    }
}
