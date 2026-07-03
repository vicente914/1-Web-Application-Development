import java.util.Scanner;
public class Ejercicio4
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num, cifra;
		
		//Resolución del problema
		try
		{
		  System.out.print("Introduce un número entero: ");
		  num = Integer.parseInt(sc.nextLine());
		  cifra = num % 10;
		  System.out.printf("La ultima cifra del número %d es %d\n",num,Math.abs(cifra));
		}
		catch(NumberFormatException e1)
		{
		  System.out.println("ERROR: No puedes introducir texto.");
		}
		catch(Exception e2)
		{
		  System.out.println("ERROR: Valor introducido incorrecto.");
		}
	}
}
