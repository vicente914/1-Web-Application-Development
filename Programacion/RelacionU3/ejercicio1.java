import java.util.Scanner;
public class ejercicio1
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		//Resolución del problema
		System.out.print("Dime un número: ");
		num1 = sc.nextInt();
		System.out.print("Dime un segundo número: ");
		num2 = sc.nextInt();
		
		if (num1>num2)
		{
		  System.out.printf("%d es mayor que %d\n",num1,num2);
		}
		else
		{
		  System.out.printf("%d es mayor que %d\n",num2,num1);
		}
	}
}
