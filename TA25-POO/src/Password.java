import java.util.Random;

public class Password {
    private int longitud;
    private String contrase�a;

    public Password() {
        longitud = 9;
        generarContrase�a();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarContrase�a();
    }

    private void generarContrase�a() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            builder.append(caracteres.charAt(index));
        }

        contrase�a = builder.toString();
    }

    public static void main(String[] args) {
        Password password = new Password();
        System.out.println("Contrase�a generada: " + password.contrase�a);
    }
}