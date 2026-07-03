import java.util.Scanner;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double a=0,b=0, x = 0;
		char letra=' ';
		//Resolución del problema
		while(letra != 's')
		{
		  try
		  {
		    System.out.print("Por favor, introduce el valor de a: ");
		    a = Double.parseDouble(sc.nextLine());
		    System.out.print("Ahora introduce el valor de b: ");
		    b = Double.parseDouble(sc.nextLine());
		    x = (-b/a);
		    if(a != 0)
		    {
		    System.out.printf("El resultado de la ecuacion de primer grado es: %d\n",x);
		    }
		    else
		    {
		      System.out.println("ERROR: No se puede dividir entre 0");
		    }
		  }
		  catch(NumberFormatException e1)
		  {
		    System.out.println("ERROR: NO puedes introducir texto");
		  }
		  catch(Exception e2)
		  {
		    System.out.println("ERROR: Valor introducido incorrecto");
		  }
		  System.out.print("Pulse (s) para salir o cualquier otra letra para continuar: ");
		  letra = sc.nextLine().toLowerCase().charAt(0);
		}
	}
}
