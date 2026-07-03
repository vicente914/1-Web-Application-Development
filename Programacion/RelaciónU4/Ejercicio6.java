import java.util.Scanner;
public class Ejercicio6
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1;
		int i;

		//Resolución del problema
		System.out.print("Escribe aquí: ");
		cad1 = sc.nextLine();
		/*
		cad2 = cad1;
		cad1=cad1.substring(0,1).toUpperCase();
		cad2=cad2.substring(1,cad2.length()).toLowerCase();
		*/

		//System.out.println(cad1+cad2);

		for(i=0; i < cad1.length(); i++)
		{
			
			if (i == 0)
			{
				System.out.print(Character.toUpperCase(cad1.charAt(i)));
			}
			else if(cad1.charAt(i) == ' ')
			{
				i++;
				System.out.print(" ");
				System.out.print(Character.toUpperCase(cad1.charAt(i)));
			}
			
			else
			{
				System.out.print(Character.toLowerCase(cad1.charAt(i)));
			}
		}
	}
}

// Character.toUpperCase(cad1.charAt(i))