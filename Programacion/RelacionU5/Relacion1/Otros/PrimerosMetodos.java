public class PrimerosMetodos
{
	public static void main(String[] args)
	{
		//Ejercicio 2
		//System.out.println(numIncrementar(3));

		//Ejercicio 3
		//System.out.println(suma(2.5f, 2.5f));
		
		//Ejercicio 4
		//limpiarPantalla();

		//Ejercicio5
		dibujarCuadrado(10);

		//Ejercicio6
		//System.out.println(obtenerSigno(0));

		//Ejercicio7
		//System.out.println(numFactorial(5));

		//Ejercicio8
		//System.out.println(numPrimo1(54));

		//Ejercicio9
		//System.out.println(numPrimo2(54));

		//Ejercicio10
		//System.out.println(esNum((char)'b'));
	}

	private static void nada()
	{

	}

	private static int numIncrementar(int num)
	{
		return num+1;
	}

	private static float suma(float num1, float num2)
	{
		return num1 + num2;
	}

	private static void limpiarPantalla()
	{
		for(int i = 0; i < 25; i++)
		{
			System.out.println();
		}
	}

	private static void dibujarCuadrado(int num)
	{
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < num; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static int obtenerSigno(double num)
	{
		int x;
		if(num > 0)
		{
			 x = 1;
		}
		else if(num < 0)
		{
			 x = -1;
		}
		else
		{
			 x = 0;
		}
		return x;
	}

	private static int numFactorial(int num)
	{
		int factorial = 1;
		for(int i = 1; i <= num; i++)
		{
			 factorial *= i;
		}
		return factorial;
	}

	private static boolean numPrimo(int num)
	{
		if(num < 2)
		{
			return false;
		}
		else if (num == 2)
		{
			return true;
		}
		else if(num % 2 == 0)
		{
			return false;
		}
		for(int i = 3; i <= Math.round(Math.sqrt(num)+1); i += 2)
		{ 
			if(num % i == 0)
			{
				return false;
			}

		}
		return true;
	}

	private static int numPrimo2(int num)
	{
		if(num < 2)
		{
			return 0;
		}
		else if (num == 2)
		{
			return num;
		}
		else if(num % 2 == 0)
		{
			return 0;
		}
		for(int i = 3; i <= Math.round(Math.sqrt(num)+1); i += 2)
		{ 
			if(num % i == 0)
			{
				return 0;
			}

		}
		return num;
	}

	private static String esNum(char character)
	{
		String numChar = "Es un número!";
		String noNumChar = "No es un número";
		if((character >= 0 && character <= 9) || (character <= 0 && character >= -9))
		{
			return numChar;
		}
		else
		{
			return noNumChar;
		}
	}
	

}