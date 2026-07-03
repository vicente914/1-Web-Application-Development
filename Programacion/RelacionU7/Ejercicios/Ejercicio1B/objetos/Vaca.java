package objetos;
public class Vaca extends Animal{
    //Atributos

    //Constructor
    public Vaca(){
        this.especie = "Bos taurus";
    }

    //Metodo
    @Override
    public void hacerSonido(){
        System.out.print("La vaca hace muu muu");
    }
}