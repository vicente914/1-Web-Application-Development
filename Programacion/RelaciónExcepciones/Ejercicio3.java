import java.util.Scanner;
public class Ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int a=999,b=999,c=999;
		double resultado1, resultado2;
		
		//Resolución del problema
		try
		{
		  System.out.print("Dime el valor de a: ");
		  a = Integer.parseInt(sc.nextLine());
		  System.out.print("Dime el valor de b: ");
		  b = Integer.parseInt(sc.nextLine());
		  System.out.print("Dime el valor de c: ");
		  c = Integer.parseInt(sc.nextLine());
		  resultado1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		  resultado2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		  System.out.println("El resultado de x1 es: "+resultado1+"\nEl resultado de x2 es: "+resultado2);
		}
		catch(NumberFormatException e1)
		{
		  System.out.println("ERROR: No puedes introducir texto");
		}
		catch(Exception e2)
		{
		  System.out.println("ERROR: Valor incorrecto");
		}
	}
}
