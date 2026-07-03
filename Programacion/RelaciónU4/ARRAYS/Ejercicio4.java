import java.util.Scanner;
//Ingresas 10 numeros y te dice cual es el maximo y el minimo
public class Ejercicio4
{
	public static void main(String[] args)
	{
		//Variables y objetos y arrays
		Scanner sc = new Scanner(System.in);
		int i, max=0, min=0;
		int[] num = new int[10];
		


		//Resolución del problema
		for(i=0;i<num.length;i++)
		{
			System.out.print("Introduce tu numero array: ");
			num[i] = sc.nextInt();	
		}

		for(i=num.length;i<0;i--)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
			
			if(num[i] < num[i+1])
			{
				min = num[i];
			}
		}

		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			if(num[i] == max)
			{
				System.out.println(max+" maximo");
			}
			
			if(num[i]==min)
			{
				System.out.println(min+" minimo");
			}
		}
	}
}