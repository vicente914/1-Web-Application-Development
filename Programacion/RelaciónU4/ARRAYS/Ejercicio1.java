import java.util.Scanner;
import java.util.regex.*;

/*
	Define un array de 12 numeros enteros con nombre num y asigna los valores segun la tabla que se muestra a continuacion.
	Muestra el contenido de todos los elementos del array. ¿Que sucede cuando con los valores de los elementos que no han sido inicializados?
*/

public class Ejercicio1
{
	public static void main(String[] args)
	{
		//Variables objetos y arrays
		int[] num;
		num = new int[12];
		int i;

		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		//Enseñamos todos los valores del array
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}