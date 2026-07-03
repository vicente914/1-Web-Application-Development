import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num=0;
		//Resolución del problema
    try 
    {
		  System.out.print("Introduce un número: ");
		  num = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException e1)
		{
		  System.out.println("ERROR: El valor introducido no es correcto");
		}
		catch (Exception e2)
		{
		  System.out.println("ERROR: El valor introducido no es correcto");
		}
		finally
		{
		  switch(num)
		  {
		    case 1:
		    {
		      System.out.println("El número introducido es 1.");
		      break;
		    }
		    case 2:
		    {
		      System.out.println("El número introducido es 2.");
		      break;
		    }
		    case 3:
		    {
		      System.out.println("El número introducido es 3.");
		      break;
		    }
		    default:
		    {
		      System.out.println("El valor introducido no es correcto");
		    } 
		  }
		}
	}
}
