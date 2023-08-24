public class Serie {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    protected static final int TEMPORADAS_POR_DEFECTO = 3;
    protected static final boolean ENTREGADO_POR_DEFECTO = false;
    protected static final String GENERO_POR_DEFECTO = "";

    public Serie() {
        numeroTemporadas = TEMPORADAS_POR_DEFECTO;
        entregado = ENTREGADO_POR_DEFECTO;
        genero = GENERO_POR_DEFECTO;
        creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroTemporadas = TEMPORADAS_POR_DEFECTO;
        entregado = ENTREGADO_POR_DEFECTO;
        genero = GENERO_POR_DEFECTO;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        entregado = ENTREGADO_POR_DEFECTO;
    }

    public static void main(String[] args) {
        Serie serie = new Serie("Plats Bruts", 6, "Comedia", "Oriol Grau");
        System.out.println("Título: " + serie.titulo);
        System.out.println("Número de Temporadas: " + serie.numeroTemporadas);
        System.out.println("Género: " + serie.genero);
        System.out.println("Creador: " + serie.creador);
    }
}