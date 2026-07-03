package objetos;
public class Bicicleta extends Vehiculo{

    //metodos
    @Override
    public void mover(){
        super.mover();
        System.out.println("... por el carril bici");
    }
}