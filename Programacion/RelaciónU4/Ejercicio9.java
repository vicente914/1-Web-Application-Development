import java.util.Scanner;
public class Ejercicio9
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		char opcion;
		String cad;
		int i, numpal=0,anum=0;

		//Resolución del problema
		do
		{

		
			System.out.print("Escribe una cadena: ");
			cad = sc.nextLine();
			System.out.println("-----------------------------------------------");
			System.out.println("[MENÚ]");
			System.out.println("a) Contar el número de letras que tiene.");
			System.out.println("b) Contar el número de palabras.");
			System.out.println("c) Contar el número de 'a'.");
			System.out.println("s) Salir");
			System.out.println("------------------------------------------------");
			System.out.print("Escoge una de las siguientes opciones: ");
			opcion = sc.nextLine().charAt(0);


			if(opcion == 'a' || opcion == 'A')
			{
			System.out.println("El número de letras que tiene la cadena es: "+cad.length());
			}
			
			else if(opcion == 'b' || opcion == 'B')
			{
				for(i=0;i<cad.length();i++)
				{
					if(cad.charAt(i)==' ') 
					{
						numpal+=1;
					}
				}
				if(cad.isEmpty())
				{
					System.out.println("Esta vacia: 0");
				}
				else
				{
					System.out.println("El número de palabras que contiene la cadena es: "+(numpal+1));
				}
			}
			
			else if(opcion == 'c' || opcion == 'C')
			{
				for(i=0;i<cad.length();i++)
				{
					if(cad.charAt(i) == 'a')
					{
						anum++;
					}
				}
				if(cad.isEmpty())
				{
					System.out.println("La cadena esta vacia: 0");
				}
				else
				{
					System.out.println("El número de 'a' en la cadena es: "+anum);
				}
			}
		}

		while(opcion != 's' && opcion != 'S');
	}
}