public class DetallePersona {
    public static void main(String[] args) {
        String nombreCompleto,paisOrigen,estadoCivil;
        int edadPersona;
        float alturaPersona;

        nombreCompleto = "Jhonatan Alexander Pereañez Aguirre";
        edadPersona = 30;
        alturaPersona = 1.70F;
        paisOrigen = "Colombia";
        estadoCivil = "C";

        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edadPersona);
        System.out.println("Altura(m): " + alturaPersona);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Estado civil Soltero(S)/Casado(C): " + estadoCivil);
    }
}
