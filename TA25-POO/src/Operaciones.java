public class Operaciones {
    private int valor1;
    private int valor2;

    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int suma() {
        return valor1 + valor2;
    }

    public int resta() {
        return valor1 - valor2;
    }

    public int multiplicacion() {
        return valor1 * valor2;
    }

    public double division() {
        if (valor2 != 0) {
            return (double) valor1 / valor2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }

    public void imprimirResultados() {
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicacion());
        System.out.println("División: " + division());
    }

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones(32, 14);
        operaciones.imprimirResultados();
    }
}
