import java.util.Random;

public class Password {
    private int longitud;
    private String contraseņa;

    public Password() {
        longitud = 9;
        generarContraseņa();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarContraseņa();
    }

    private void generarContraseņa() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            builder.append(caracteres.charAt(index));
        }

        contraseņa = builder.toString();
    }

    public static void main(String[] args) {
        Password password = new Password();
        System.out.println("Contraseņa generada: " + password.contraseņa);
    }
}