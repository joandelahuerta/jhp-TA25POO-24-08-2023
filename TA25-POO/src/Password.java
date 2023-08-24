import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        longitud = 9;
        generarContraseña();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarContraseña();
    }

    private void generarContraseña() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            builder.append(caracteres.charAt(index));
        }

        contraseña = builder.toString();
    }

    public static void main(String[] args) {
        Password password = new Password();
        System.out.println("Contraseña generada: " + password.contraseña);
    }
}