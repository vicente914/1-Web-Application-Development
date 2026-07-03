import java.util.Scanner;

/*
Define tres arrays de 20 numeros enteros cada una con nombres numero cuadradao y cubo.
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado
se deben almacenar los cuadrados de los valores que hay en el array numero.
En el array cubo se deben almacenar los cubos de los valores que hay en numero.
A continuacion, muesra el contenido de los tres arrays dispuesto en tres columnas

*/
public class Ejercicio3
{
	public static void main(String[] args)
	{
		
		//Variables objetos y Arrays
		int i;
		int[] num = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		
		//Resolucion del problema

		System.out.println(" --------------------------- ");
		System.out.printf("| %-6s | %-8s | %-8s |\n","Numero","Cuadrado","Cubo");
		System.out.println("|--------------------------------|");
		for(i=0;i<num.length;i++)
		{			
			num[i] = (int)(Math.random()*(100+1));
			
			cuadrado[i] = (int)Math.pow(num[i], 2);
				
			cubo[i] = (int)Math.pow(num[i], 3);

			System.out.printf("| %6d | %8d | %8d |\n",num[i],cuadrado[i],cubo[i]);
			
		}
		System.out.println("-------------------------------------");


	}
}