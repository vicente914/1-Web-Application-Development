import java.util.Scanner;
public class ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num;
		
		//Resolución del problema
		System.out.print("Dime un número para comprobar: ");
		num = sc.nextInt();
		if (num%2  == 0)
		{
		  System.out.printf("El número proporcionado es par\n",num);
		}
		else
		{
		  System.out.printf("El número proporcionado es impar\n");
		}
	}
}
