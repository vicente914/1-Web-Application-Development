import java.util.Scanner;
public class Ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double precio, alto, ancho, bandera, total;
		char bordado = ' ';
		
		//Resolución del problema
		try
		{
		  while(bordado != 'n' && bordado != 's')
		  {
		    System.out.print("Introduzca la altura de la bandera en cm: ");
		    alto = Double.parseDouble(sc.nextLine());
		    System.out.print("Ahora introduzca la anchura: ");
		    ancho = Double.parseDouble(sc.nextLine());
		    System.out.print("¿Quiere escudo bordado? (s/n): ");
		    bordado = sc.nextLine().toLowerCase().charAt(0);
		    
		    precio = (alto*ancho)*0.01;
		    
		    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		    System.out.printf("Bandera de %.0fcm2: %.2f €\n",(alto*ancho),precio);
		    if(bordado == 'n')
		    {
		      System.out.println("Sin escudo: 0,00 €");
		      System.out.println("Gastos de envío: 3,25 €");
		      total = precio+3.25;
		      System.out.printf("Total: %.2f\n",total);
		    }
		    else
		    {
		      if(bordado == 's')
		      {
		        System.out.println("Con escudo: 2,50 €");
		        System.out.println("Gastos de envío: 3,25 €");
		        total = precio+2.50+3.25;
		        System.out.printf("Total: %.2f\n",total);
		      }
		      else
		      {
		        System.out.println("Introduce una opción correcta entre (s/n) ");
		      }
		    }
		  }
		}
		catch(NumberFormatException e1)
		{
		  System.out.println("ERROR: NO puedes introducir texto.");
		}
		catch(Exception e2)
		{
		  System.out.println("ERROR: El valor introducido es incorrecto.");
		}
		
		
	}
}
