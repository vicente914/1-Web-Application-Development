import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio8
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int[] original = new int[20];
		int[] ordenado = new int[20];
		int i, x;
		//Resolucion del problema
		for(i=0;i<original.length;i++)
		{
			original[i] = (int)(Math.random()*(100+1));
		}
		System.out.println("Lista original: "+Arrays.toString(original));

		x=0;
		for(i=0;i<original.length;i++)
		{
			if(original[i]%2 == 0)
			{
				ordenado[x] = original[i];
				x++;
			}
		}
		
		x = original.length-1;
		for(i=original.length-1;i>0;i--)
		{
			if(original[i]%2 != 0)
			{
				ordenado[x] = original[i];
				x--;
			}
		}
		
		System.out.println("Lista ordenada: "+Arrays.toString(ordenado));

	}
}