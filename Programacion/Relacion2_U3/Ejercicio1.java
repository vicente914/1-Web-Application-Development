import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num, factorial = 1;
		
		//Resolución del problema
		System.out.print("Dime un número para calcular su factorial: ");
		num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++)
		{
		  factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}
}
