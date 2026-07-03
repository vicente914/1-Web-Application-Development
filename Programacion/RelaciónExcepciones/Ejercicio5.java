import java.util.Scanner;
public class Ejercicio5
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num, cifra;
		
		//Resolución del problema
		try
		{
		  System.out.print("Introduce un número entero de maximo 5 cifras: ");
		  num = Integer.parseInt(sc.nextLine());
		  if(num > 99999 || num < -99999)
		  {
		    System.out.println("NO puedes introducir números mayores de cinco cifras");
		  }
		  else
		  {
		    if(num > 10 && num < 100)
		    {
		      cifra = num / 10;
		      System.out.printf("La ultima cifra del número %d es %d\n",num,cifra);
		    }
		    else
		    {
		      if(num > 100 && num < 1000)
		      {
		        cifra = num / 100;
		        System.out.printf("La ultima cifra del número %d es %d\n",num,cifra);
		      }
		      else
		      {
		        if(num > 1000 && num < 10000)
		        {
		          cifra = num / 1000;
		          System.out.printf("La ultima cifra del número %d es %d\n",num,cifra);
		        }
		        else
		        {
		          if(num > 10000 && num < 100000)
		          {
		            cifra = num / 10000;
		            System.out.printf("La ultima cifra del número %d es %d\n",num,cifra);
		          }
		        }
		      }
		    }
		  }
		}
		catch(NumberFormatException e1)
		{
		  System.out.println("ERROR: No puedes introducir texto.");
		}
		catch(Exception e2)
		{
		  System.out.println("ERROR: Valor introducido incorrecto.");
		}
	}
}
