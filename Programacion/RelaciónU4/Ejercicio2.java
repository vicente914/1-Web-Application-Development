import java.util.Scanner;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1 = "Hola Vicente";
		int i;

		//Resolución del problema
		for(i=0;i < cad1.length();i++)
		{
			System.out.println(cad1.charAt(i));
		}
	}
}