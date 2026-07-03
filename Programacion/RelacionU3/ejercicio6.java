import java.util.Scanner;
public class ejercicio6
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		
		//Resolución del problema
		System.out.print("Escribe una cadena: ");
		cadena = sc.nextLine();
		
		if (cadena.equals(cadena.toUpperCase()))
		{
		  System.out.print("La cadena introducida es mayúscula\n");
		}
		else
		{
		  System.out.print("La cadena introducida es minúscula\n");
		}
	}
}
