public class Libro {
    private String autor;
    private String titulo;
    private String ubicacion;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setAutor("Pablo Motos");
        libro.setTitulo("Las Hormigas nos atacan");
        libro.setUbicacion("El Corte Ingles");

        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Ubicación: " + libro.getUbicacion());
    }
}