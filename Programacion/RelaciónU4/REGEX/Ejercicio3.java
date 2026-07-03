import java.util.Scanner;
import java.util.regex.*;
public class Ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String matricula;
		String regex = "[0-9]{4}[A-Z^(AEIOUÑQ)]{3}"; // ^ DENTRO DE UN CORCHETE SIGNIFICA NEGACION


		//Resolución del problema
		System.out.print("Escribe la matrícula de tu coche: ");
		matricula = sc.nextLine();


	}
}