public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_POR_DEFECTO = 'H';

    public Persona() {
        sexo = SEXO_POR_DEFECTO;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Enrique", 43, "562366344", 'H', 90, 160);
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("DNI: " + persona.DNI);
        System.out.println("Sexo: " + persona.sexo);
        System.out.println("Peso: " + persona.peso);
        System.out.println("Altura: " + persona.altura);
    }
}