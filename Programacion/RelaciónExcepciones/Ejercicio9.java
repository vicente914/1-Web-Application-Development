import java.util.Scanner;
public class Ejercicio9
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
			for(i=0;i < cadena.length();i++)
			{
				System.out.println(cadena.charAt(i));
			}
		}
		catch(Exception e1)
		{
			System.out.println("ERROR: Valor introducido incorrecto."+e1);
		}
	}
}

//with this bucle we are introducing a string of text to show on screen every character of the string individually.