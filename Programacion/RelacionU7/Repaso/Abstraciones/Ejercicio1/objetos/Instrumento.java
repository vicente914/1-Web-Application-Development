package objetos;
public abstract class Instrumento{
    protected String nombre;

    //constructor
    public Instrumento(String nombre){
        this.nombre = nombre;
    }

    //Metodos
    public void afinar(){
        System.out.println("Afinando " + nombre);
    }

    public abstract void tocar();
}