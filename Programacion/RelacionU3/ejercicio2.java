import java.util.Scanner;
public class ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double num;
		
		//Resolución del problema
		System.out.print("Dime un número para comprobar: ");
		num = sc.nextDouble();
		if(num > 0)
		{
		  System.out.printf("El número %.2f es positivo\n",num);
		}
		else
		{
		  if (num == 0)
		  {
		    System.out.printf("El número %.2f es igual a 0\n",num);
		  }
		  else
		  {
		    System.out.printf("El número %.2f es negativo\n",num);
		  }
		}
	}
}
