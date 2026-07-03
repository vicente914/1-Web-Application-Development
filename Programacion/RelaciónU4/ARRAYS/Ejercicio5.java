import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio5
{
	public static void main(String[] args)
	{
		//Variables y objetos
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int i, aux;
		
		//Resolucion del problema
		
		for(i=0;i<num.length;i++)
		{
			System.out.print("Introduce tu numero para el array: ");
			num[i] = sc.nextInt();
		}
		System.out.println("Original: "+Arrays.toString(num));

		
		aux = num[4];
		
		for(i=4;i>0;i--)
		{
			num[i] = num[i-1];
		}
		System.out.println(Arrays.toString(num));
		num[0] = aux;
		
		System.out.println("Rotado: "+Arrays.toString(num));
		//System.out.println("Rotado: "+Arrays.toString(numRotado));

	}
}