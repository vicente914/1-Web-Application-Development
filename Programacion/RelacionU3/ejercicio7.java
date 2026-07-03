import java.util.Scanner;
public class ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double base,exponente,resultado;
		
		//Resolución del problema
		System.out.print("Dime el número base: ");
		base = sc.nextDouble();
		System.out.print("Dime el exponente al que quieres elevar tu base: ");
		exponente = sc.nextDouble();
		
		resultado = 1/Math.pow(base,exponente);
		
		if(exponente > 0)
		{
		  System.out.printf("La potencia es: %.0f\n",Math.pow(base,exponente));
		}
		else
		{
		  if(exponente == 0)
		  {
		    System.out.printf("La potencia es: 1\n");
		  }
		  else
		  {
		    System.out.printf("La potencia es: %.0f\n",resultado);
		  }
		}
		
	}
}
