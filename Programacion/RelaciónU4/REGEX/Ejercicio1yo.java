import java.util.Scanner;
import java.util.REGEX.*;
public class Ejercicio1yo
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String dni;
		String regex = "[0-9]{8}[A-Z]";
		String letras "TRWAGMYFPDXBNJZSQVHLCKE";

		//Resolución del problema
		System.out.print("Introduce tu dni: ");
		dni = sc.nextLine();

		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(dni);
		if()
		{
			
		}

	}
}