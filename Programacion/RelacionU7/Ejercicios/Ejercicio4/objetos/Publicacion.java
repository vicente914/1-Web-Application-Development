package objetos;
public class Publicacion {
    //Atributos
    protected String isbn, titulo;
    protected int anioPublicacion;

    //Constructor
    public Publicacion(String isbn, String titulo, int anioPublicacion){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    //Metodos
}