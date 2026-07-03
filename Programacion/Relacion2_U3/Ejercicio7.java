import java.util.Scanner;
public class Ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num, multiplicador = 0;
		
		//Resolución del problema
		System.out.print("Introduce el número del que quieras ver su tabla de multiplicar: ");
		num = sc.nextInt();
		
		while(multiplicador <10)
		{
		  multiplicador += 1;
		  System.out.println(num*multiplicador);
		}
	}
}
