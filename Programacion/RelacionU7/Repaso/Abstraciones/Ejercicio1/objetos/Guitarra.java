package objetos;
public class Guitarra extends Instrumento{
    
    //Constructor
    public Guitarra(String nombre){
        super(nombre);
    }

    //Metodos implementados
    @Override
    public void tocar(){
        System.out.println("La guitarra esta sonando: ¡Ras ras ras!");
    }
}