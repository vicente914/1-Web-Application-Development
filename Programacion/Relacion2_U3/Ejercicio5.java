import java.util.Scanner;
public class Ejercicio5
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		char letra=' ';
		
		//Resolución del problema
		while(letra == ' ')
		{
		  System.out.print("Dime una letra: ");
		  letra = sc.nextLine().toLowerCase().charAt(0);
		  if(letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
		  {
		    System.out.println("VOCAL");
		  }
		  else
		  {
		    System.out.println("NO es VOCAL");
		  }
		}
		
		System.out.println("Fin del programa");
		
	}
}
