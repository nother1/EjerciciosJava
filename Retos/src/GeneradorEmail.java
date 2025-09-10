public class GeneradorEmail {
    public static void main(String[] args) {
        String nombrePersona, empresaPersona, dominioWeb, correoElectronico = "";
        nombrePersona = "Jhonatan Alexander Pereañez Aguirre";
        empresaPersona = "Free Lancer Company";
        dominioWeb = "com.co";

        System.out.println("Nombre Persona: " + nombrePersona);
        System.out.println("Empresa: " + empresaPersona);
        System.out.println("Dominio: " + dominioWeb);

        nombrePersona = nombrePersona.toLowerCase();
        nombrePersona = nombrePersona.trim();
        nombrePersona = nombrePersona.replace(' ', '.');

        empresaPersona = empresaPersona.toLowerCase();
        empresaPersona = empresaPersona.trim();
        empresaPersona = empresaPersona.replace(" ", "");

        correoElectronico = String.join(correoElectronico,nombrePersona,"@",empresaPersona,".",dominioWeb );
        System.out.println("Correo Electronico: " + correoElectronico);
    }
}
