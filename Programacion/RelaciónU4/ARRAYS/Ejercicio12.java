import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio12
{
	public static void main(String[] args)
	{
		//Variables y objetos
		int[] numeros = {2,5,9,-4,6};
		int[] num2 = new int[10];

		Arrays.fill(num2,-1);

		//Resolucion del problema
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println(numeros[i]);
		}

		//System.out.println(Arrays.toString(numeros));
		
		//Arrays.sort(numeros);

		System.out.println(Arrays.toString(numeros));
		
		//System.out.println(Arrays.toString(num2));
		
		System.out.println("El nueve esta en la posición: "+Arrays.binarySearch(numeros,9));
		
		if(Arrays.equals(numeros,numeros))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
		
	}
}