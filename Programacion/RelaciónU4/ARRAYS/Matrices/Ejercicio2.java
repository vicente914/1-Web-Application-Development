import java.util.Scanner;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[4][5];
		int i, j, col=0, row=0;

		
		//Resolución del problema
		/*Recorremos cada posicion de la matriz asignando un valor en cada posicion
		y con un println hacemos saltos de linea por fila recorrida de la matriz
		y mostramos por pantalla el valor de cada posición*/
		for(i = 0; i < num.length; i++)
		{
			for(j = 0; j < num[i].length; j++)
			{
				num[i][j] = (int)(Math.random()*(10+1)); 
		
				System.out.print(num[i][j]+ " | ");
			}
			System.out.println();

		}

		/*Esto es simplemente como algo visual*/
		System.out.println();
		System.out.println("----------------------------");	
		System.out.println();


		/*Sumamos cada valor de cada fila y mostramos el resultado al final de la fila*/
		for(i = 0; i< num.length; i++)
		{
			row = 0;
			for(j = 0; j < num[i].length; j++)
			{
				System.out.print(num[i][j]+" | ");
				row += num[i][j];

			}
			System.out.println(row);
		}

		/*Sumamos cada valor de la columna y mostramos el resultado al fina de la columna*/
		for(j = 0; j< num[0].length; j++)
		{
			col = 0;
			for(i = 0; i < num.length; i++)
			{
				col += num[i][j];
			}
			System.out.print(col+" |");
		}

		System.out.println(col+row+1);
	}
}