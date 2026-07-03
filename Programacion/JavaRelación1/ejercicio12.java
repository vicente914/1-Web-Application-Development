import java.util.Scanner;
public class ejercicio12
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;
		
		//Resolución del problema
		System.out.print("Dime tu primer número: ");
		x1 = sc.nextDouble();
		System.out.print("Dime tu segundo número: ");
		y1 = sc.nextDouble();
		System.out.print("Dime tu primer número de tu segundo par: ");
		x2 = sc.nextDouble();
		System.out.print("Dime tu segundo número de tu segundo par: ");
		y2 = sc.nextDouble();
		
		System.out.printf("La distancia entre los dos puntos en este plano es %.2f\n",Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
	}
}
