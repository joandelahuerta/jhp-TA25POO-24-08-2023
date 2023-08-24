public class Coche {
    private String marca;
    private String modelo;
    private int cilindrada;
    private double potencia;

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Trueno";
        coche.modelo = "AE86";
        coche.cilindrada = 1600;
        coche.potencia = 150;

        System.out.println("Marca: " + coche.marca);
        System.out.println("Modelo: " + coche.modelo);
        System.out.println("Cilindrada: " + coche.cilindrada + " cc");
        System.out.println("Potencia: " + coche.potencia + " HP");
    }
}