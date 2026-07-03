public class Ave extends Animal{
    private int envergadura;

    public Ave(String nombre, String edad, String habitat, int envergadura){
        super(nombre, edad, habitat);
        this.envergadura = envergadura;
    }


    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("Envergadura del ala: %d", envergadura);
    }
}