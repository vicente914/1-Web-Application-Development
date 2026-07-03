package objetos;
public class Perro extends Animal{
    //Atributos
    
    //Constructor
    public Perro(){
        this.especie = "Canis";
    }
    //Metodos
    @Override
    public void hacerSonido(){
        System.out.print("El perro hace guau guau");
    }
}