import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int[] temperaturas = new int[12];
		enum Mes{Ene, Feb, Mar, Abr, May, Jun, Jul, Ago, Sep, Oct, Nov, Dic}
		int i=0;

		//Resolución del problema
		for(Mes nombreMes : Mes.values())
		{
			System.out.printf("Escribe aquí la temperatura de %s: \n",nombreMes);
			temperaturas[i] = sc.nextInt();
			i++;
		}

		i = 0;
		for(Mes nombreMes : Mes.values())
		{
			System.out.print("\n"+nombreMes +": ");
			for(int x=0;x<temperaturas[i];x++)
			{
				System.out.print("*");
			}

			i++;
		}
		System.out.println();
	}
}