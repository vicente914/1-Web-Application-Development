package objetos;
public class Coche extends Vehiculo{

    //metodos
    @Override
    public void mover(){
        super.mover();
        System.out.println("...por la carretera");
    } 
}