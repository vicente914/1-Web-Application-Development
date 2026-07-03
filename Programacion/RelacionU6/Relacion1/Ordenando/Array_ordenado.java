
import java.util.Arrays;
public class Array_ordenado
{
    public static void main(String[] args)
    {
        //Creamos un array de 5 enteros
        int[] array = {1,8,4,2,3};

        //Mostramos por pantalla
        System.out.println("Sin ordenar: "+ Arrays.toString(array));

        //Lo ordenamos
        Arrays.sort(array);
        //Mostramos por pantalla
        System.out.println("Ordenado: "+ Arrays.toString(array));
    }
}