package objetos;
public class Revista extends Publicacion{
    //atributos
    private int numRevista;

    //Constructor
    public Revista(String isbn, String titulo, int anioPublicacion, int numRevista){
        super(isbn, titulo, anioPublicacion);
        this.numRevista = numRevista;
    }

    //Metodoss
}