import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int[] num= new int[100];
		int i, valor1, valor2;

		//Resolución del problema
		for(i=0;i<num.length;i++)
		{
			num[i] = (int) (Math.random()*(20+1));
		}
		System.out.println(Arrays.toString(num));

		System.out.print("Introduce un valor: ");
		valor1 = sc.nextInt();
		System.out.print("Introduce tu segundo valor: ");
		valor2 = sc.nextInt();

		for(i=0;i<num.length;i++)
		{
			if(num[i] == valor1)
			{
				num[i] = valor2;
				System.out.print("\""+num[i]+"\"-");
			}
			else
			{
				System.out.print(num[i]+"-");
			}
		}
	}
}