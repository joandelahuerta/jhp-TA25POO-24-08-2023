public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void mensajeMayorEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Rue", 21);
        alumno.imprimirDatos();
        alumno.mensajeMayorEdad();
    }
}