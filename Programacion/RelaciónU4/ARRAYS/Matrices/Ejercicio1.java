import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[3][6];
		
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		for(int[] numeros : num)
		{
			System.out.print("|");
			for(int numero : numeros)
			{
				System.out.print(numero + " ");
			}
			System.out.print("|");
			System.out.println();
		}

	}
}