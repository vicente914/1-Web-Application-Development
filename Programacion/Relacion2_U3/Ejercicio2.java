import java.util.Scanner;
import java.util.Random;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numAleatorio, respuesta = 0;
		int intentos = 0;
		
		//Resolución del problema
		numAleatorio = random.nextInt(1, 101);
		System.out.println(numAleatorio);

		
		while(respuesta != numAleatorio)
		{
		  intentos++;
		  System.out.print("Adivina el número aleatorio entre 1 y 100: ");
		  respuesta = sc.nextInt();
		  if(respuesta < numAleatorio)
		  {
		    System.out.print("Adivina el número aleatorio, es mayor: ");
		    respuesta = sc.nextInt();
		  }
		  else
		  {
		    if(respuesta > numAleatorio)
		    {  
		      System.out.print("Adivina el número aleatorio, es menor: ");
		      respuesta = sc.nextInt();
		    }
		    else
		    {
		      System.out.println("Enhorabuena, acertaste el numero correcto, tu número de intentos fue: "+intentos);
		      break;
		    }
		    if(intentos == 10)
	      {
	        System.out.println("Llegaste al número maximo de intentos permitidos, el número era: "+numAleatorio);
	        break;
	      }
		  }
		}
		
	}
}
