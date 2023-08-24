public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }

    public void mensajeImpuestos() {
        if (sueldo > 3000) {
            System.out.println("Debe pagar impuestos.");
        } else {
            System.out.println("No debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", 4200);
        empleado.imprimirDatos();
        empleado.mensajeImpuestos();
    }
}