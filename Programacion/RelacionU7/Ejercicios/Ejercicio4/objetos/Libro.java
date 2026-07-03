package objetos;
public class Libro extends Publicacion implements Prestable{
    //Atributos
    private boolean prestado;

    //Constructor
    public Libro(String isbn, String titulo, int anioPublicacion){
        super(isbn, titulo, anioPublicacion);
        this.prestado = false;
    }

    //Metodos
    @Override
    public void prestar(){
        prestado = true;
    }

    @Override
    public void devolver(){
        prestado = false;
    }

    @Override
    public boolean estaPrestado(){
        return prestado;
    }
}