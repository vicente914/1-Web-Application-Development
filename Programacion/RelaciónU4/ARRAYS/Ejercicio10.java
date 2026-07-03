import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio10
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String[] frases = new String[10];
		int i;

		//Resolución del problema
		for(i=0;i<frases.length;i++)
		{
			System.out.print("Introduce una frase: ");
			frases[i] = sc.nextLine();
		}
		
		for(i=0;i<frases.length;i++)
		{
			System.out.printf("%s ",frases[i]);
		}
	}
}