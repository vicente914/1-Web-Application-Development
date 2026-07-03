import java.util.Scanner;
public class ejercicio8
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String sexo;
		double nota;
		int edad;
		
		//Resolución del problema
		System.out.print("Dime tu nota: ");
		nota = sc.nextDouble();
		System.out.print("Dime tu edad: ");
		edad = sc.nextInt();
		
		System.out.print("Dime tu genero: ");
		sc.nextLine();
		sexo = sc.nextLine();
		
		if(nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F"))
		{
		  System.out.print("ACEPTADA\n");
		}
		else
		{
		  if(nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M"))
		  {
		    System.out.print("POSIBLE\n");
		  }
		  else
		  {
		    System.out.print("NO ACEPTADA\n");
		  }
		}
	}
}
