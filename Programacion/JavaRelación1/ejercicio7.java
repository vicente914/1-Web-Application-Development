import java.util.Scanner;
public class ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double minutos, horas, minutos2;
		
		//Resolución del problema
		System.out.print("Dime una cantidad de minutos: ");
		minutos = sc.nextDouble();
		horas = minutos/60;
		minutos2 = minutos%60;
		System.out.printf("La cantidad de horas es %f con %.2f minutos\n",horas,minutos2);
	}
}
