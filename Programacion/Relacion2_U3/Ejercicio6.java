import java.util.Scanner;
public class Ejercicio6
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1, num2, contador;
		
		//Resolución del problema
		System.out.print("Introduce el primer número para establecer nuestro rango: ");
		num1 = sc.nextInt();
		System.out.print("Introduce el número para cerrar nuestro rango: ");
		num2 = sc.nextInt();
		
		if(num1 > num2)
		{
		  System.out.println("ERROR: El primer número introducido debe ser inferior para establecer el rango correctamente");
		}
		else
		{
		  for(contador = num1; contador <= num2; contador += 2)
	    {
	      if(contador % 2 == 0)
	      {
	        System.out.println(contador);
	      }
	      else
	      {
	        contador +=1;
	        System.out.println(contador);
	      }
	    }
		}
	}
}
