import java.util.Scanner;
public class ejercicio10
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		
		//Resolución del problema
		System.out.print("Dime el valor de A: ");
		A = sc.nextDouble();
		System.out.print("Dime el valor de B: ");
		B =sc.nextDouble();
		System.out.print("Dime el valor de C: ");
		C = sc.nextDouble();
		
		if(Math.pow(A,2)+Math.pow(B,2) == Math.pow(C,2))
		{
		  System.out.println("Es un triángulo rectángulo");
		}
		else
		{
		  if(A == B && A == C && B == C)
		  {
		    System.out.println("Es un triángulo equilátero");
		  }
		  else
		  {
		    if(A == B || A == C || B == C)
		    {
		      System.out.println("Es un triángulo isósceles");
		    }
		    else
		    {
		      System.out.println("Es un triángulo escaleno");
		    }
		  }
		}
	}
}
