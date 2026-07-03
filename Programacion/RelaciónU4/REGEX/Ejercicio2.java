import java.util.Scanner;
import java.util.regex.*;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String nie;
		String regex ="[X-Zx-z][0-9]{7}[A-Z]";
		char letra1, letra2;
		String letras = "XYZ";
		String letras2 = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numeroLetras, numeroLetras2;

		//Resulicion del problema
		System.out.print("Introduce tu NIE: ");
		nie = sc.nextLine();

		//System.out.println(nie.charAt(0));
		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(nie);
		
		if(m.matches())
		{
			System.out.println("Cumple expresión regular");
			if(nie.charAt(0) == 'X')
			{
				System.out.println("La primera letra es 0");
			}
			else if (nie.charAt(0) == 'Y')
			{
				System.out.println("La primera letra es 1");
			}
			else if (nie.charAt(0) == 'Z')
			{
				System.out.println("La primera letra es 2");
			}
		}
		else 
		{
			System.out.println("NIE invalido, NO cumple expresión regular");
		}
		
		
	}
}