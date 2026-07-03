package objetos;
public class Piano extends Instrumento{

    //Constructor
    public Piano(String nombre){
        super(nombre);
    }

    //Metodos implementados
    public void tocar(){
        System.out.println("El piano esta sonando: ¡Ding dong ding dong!");
    }
}