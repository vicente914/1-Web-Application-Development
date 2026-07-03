public class Ejercicio3
{
	public static void main(String[] args)
	{
		//Variables y objetos declarados
		int[][] num = new int[6][10];
		int i, j, x, y, min=1000, max=0, rowMin=0, rowMax=0, colMin=0, colMax=0, random=0;

		//Resolución del problema	

		/*Asigna y evita que hayan valores repetidos dentro de la matriz*/
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<num[i].length;j++)
			{
				do
				{
					random = (int)(Math.random()*(1000+1));
				}
				while(num[i][j] == random);
				num[i][j] = random;
			}
		}



		for(i = 0; i < num.length;i++)
		{
			for(j = 0; j < num[i].length;j++)
			{
				if(num[i][j] < min)
				{
					min = num[i][j];
					rowMin = i;
					colMin = j;
				}
				if(num[i][j] > max)
				{
					max = num[i][j];
					rowMax = i;
					colMax = j;
				}

				System.out.print(num[i][j]+" ");

			}
			System.out.println();
		}


		System.out.printf("Max: %d posc: (%d,%d)\n",max,rowMax,colMax);
		System.out.printf("Min: %d posc: (%d,%d)\n",min,rowMin,colMin);
	}
}
