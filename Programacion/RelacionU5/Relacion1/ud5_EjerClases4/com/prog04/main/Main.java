
import com.prog04.figuras.Rectangulo;

public class Main
{
    public static void Main(String[] args)
    {
        //Objetos
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(15,5);

        //Comprobamos metodos GET
        rectangulo1.getBase();
        rectangulo1.getAltura();

    }
}