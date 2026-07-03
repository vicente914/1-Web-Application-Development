import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String[]args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad;
		int i;

		//Resolución del problema
		System.out.print("Dime una cadena: ");
		cad = sc.nextLine();
		for(i=0;i < cad.length();i++)
		{
			System.out.println(cad.charAt(i));
		}	
	}
}