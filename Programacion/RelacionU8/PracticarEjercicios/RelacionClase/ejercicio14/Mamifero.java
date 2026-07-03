public class Mamifero extends Animal{
    private boolean domestico;

    public Mamifero(String nombre, String edad, String habitat, boolean domestico){
        super(nombre, edad, habitat);
        this.domestico = domestico;
    }

    //metodos
    @Override
    public String toString(){
        return super.toString() + String.format("Domestico: %b\n",domestico);
    }

}