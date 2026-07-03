import java.util.Scanner;
public class Ejercicio10
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cadena;
		int i;

		//Resolución del problema
		try
		{	
			System.out.print("Introduce una cadena de texto: ");
			cadena = sc.nextLine();
			System.out.println(cadena.toUpperCase().charAt(0));
			for(i=0;i < cadena.length();i++)
			{
				System.out.println(cadena.charAt(i+1));
			}
		}
		catch(Exception e1)
		{
			System.out.println("ERROR: Valor introducido incorrecto."+e1);
		}
	}
}