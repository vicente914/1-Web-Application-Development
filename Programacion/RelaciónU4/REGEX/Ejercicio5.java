import java.util.Scanner;
import java.util.regex.*;
public class Ejercicio5
{
	public static void main(string[] args)
	{
		//Variables y objetos
		Scanner sc = new Scaner(System.in);
		String regex ="\d{1,2}\\/\d{1,2}\\/\d{1,4}";
		String fecha;

		//Resolución del problema
		System.out.print("Introduce una fecha: ");
		fecha = sc.nextLine();

		Pattern patron = Pattern.compile(regex);
		Matcher m = patron.matcher(fecha)

		if(m.matches())
		{
			System.out.println("Fecha valida");
		}
		else
		{
			System.out.print("Fecha invalida");
		}
	}
}