import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int respuesta = 1234, suma = 0, media, contador = 0;
		
		//Resolución del problema
		while (respuesta != 0)
		{
		  System.out.print("Dame un número: ");
		  respuesta = sc.nextInt();
		  suma += respuesta;
		  contador++;
		}
		media = suma/(contador-1);
		System.out.printf("\nEl resultado de la suma es %d y la media es %d\n",suma,media);
	}
}
