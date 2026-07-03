import java.util.Scanner;
import java.util.regex.*;
public class MiPrimerArray
{
	public static void main(String[] args)
	{
		//Variables y objetos
		int suma=0,i,var1=2,var2=4;
		
		//declaramos un array
		int[] array1 = {1, 2, 3, 4, 5};
		double[] array2 = {2.3, 8.4, 0.25};

		for(i=0;i<5;i++)
		{
			suma+=array1[i];
		}
		System.out.println("Suma: "+ sumarArrayInt(array1));
		System.out.println("Sumar dos valores: "+sumar2Valores(var1,var2));
	}

	//nuevo metodo
	public static int sumarArrayInt(int[] array)
	{
		int suma=0;
		for(int i=0;i<array.length;i++)
		{
			suma+=array[i];
		}
		return suma;
	}

	public static int sumar2Valores(int a, int b)
	{

		return a+b;
	}
}