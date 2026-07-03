import java.util.Scanner;
import java.util.regex.*;

/*
Hacer un programa que introduzcas 10 numeros(array) y mostrarlos en orden inverso
*/

public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables, objetos y arrays
		Scanner sc = new Scanner(System.in);

		int i;
		int[] num = new int [10];

		//Resolucion del problema
		for(i=0;i<10;i++)
		{
			System.out.print("Introduce un numero para nuestro array: ");
			num[i] = sc.nextInt();
		}

		//System.out.println(num[i-1]);
		

		for(i=10;i>0;i--)
		{
			System.out.println(num[i-1]);
		}
		
	}
}