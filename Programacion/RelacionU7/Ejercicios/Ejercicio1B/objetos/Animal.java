package objetos;
public abstract class Animal{
    //Atributos
    protected String especie;

    //metodo
    public abstract void hacerSonido();

    public String getEspecie(){
        return especie;
    }
}