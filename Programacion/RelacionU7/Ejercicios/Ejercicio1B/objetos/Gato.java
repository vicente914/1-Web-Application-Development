package objetos;
public class Gato extends Animal{
    //Atributos

    //Constructor
    public Gato(){
        this.especie = "Catus felis";
    }

    //Metodo
    @Override
    public void hacerSonido(){
        System.out.print("El gato hace miau miau");
    }
}