import java.util.Arrays;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final String COLOR_POR_DEFECTO = "blanco";
    protected static final char CONSUMO_POR_DEFECTO = 'F';
    protected static final double PRECIO_BASE_POR_DEFECTO = 100;
    protected static final double PESO_POR_DEFECTO = 5;

    protected static final String[] COLORES_DISPONIBLES = { "blanco", "negro", "rojo", "azul", "gris" };

    public Electrodomestico() {
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
        precioBase = PRECIO_BASE_POR_DEFECTO;
        peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = COLOR_POR_DEFECTO;
        consumoEnergetico = CONSUMO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        if (Arrays.asList(COLORES_DISPONIBLES).contains(color)) {
            return color;
        } else {
            return COLOR_POR_DEFECTO;
        }
    }

    private char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        } else {
            return CONSUMO_POR_DEFECTO;
        }
    }

    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(200, "rojo", 'A', 120);
        System.out.println("Precio Base: " + electrodomestico.precioBase);
        System.out.println("Color: " + electrodomestico.color);
        System.out.println("Consumo Energético: " + electrodomestico.consumoEnergetico);
        System.out.println("Peso: " + electrodomestico.peso);
    }
}