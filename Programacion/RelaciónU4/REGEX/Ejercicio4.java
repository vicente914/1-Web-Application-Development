import java.util.Scanner;
import java.util.regex.*;
public class Ejercicio4
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String email;
		String regex = "^[^\\.]([a-z]{1,})([0-9]{1,})([_\\.-]{1,})[^\\.]$@^((^\\.)([a-z]{1,})([0-9]{1,})([-]{1,})){1,}\\.([\\.com||\\.org||\\.cc]{2,})([^\\.])$"; 

		//Resolución del problema
		System.out.print("Introduce tu email: ");
		email = sc.nextLine();

		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(email);
		
		if(m.matches())
		{
			System.out.print("Email escrito correctamente");
		}
		else
		{
			System.out.println("Email escrito incorrectamente");
		}

	}
}