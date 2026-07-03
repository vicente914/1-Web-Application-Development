import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        //Creamos los objetos
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Vaca();

        //Usamos los metodos
        
        for(int i = 0; i < animales.length; i++)
        {
            animales[i].hacerSonido();
            System.out.println(animales[i].getEspecie());
        }
    }
}