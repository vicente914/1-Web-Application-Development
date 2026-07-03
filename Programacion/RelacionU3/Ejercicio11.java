import java.util.Scanner;
public class Ejercicio11
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int fecha;
		
		//Resolución del problema
		System.out.print("Introduce el año que quieres comprobar: ");
		fecha = sc.nextInt();
		
		if(fecha%4 == 0 && fecha%100 > 0 || fecha%400 == 0)
		{
		  System.out.print("El año introducido es bisiesto\n");
		}
		else
		{
		  System.out.print("El año introducido no es bisiesto\n");
		}
  }
} 
