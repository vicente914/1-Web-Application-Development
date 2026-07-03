import java.util.Scanner;

public class ejercicio5
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		double fahrenheit, celsius;
		
		//Resolución del problema
		System.out.print("Dime los grados en escala Fahrenheit: ");
		fahrenheit = sc.nextDouble();
		
		celsius = (fahrenheit-32)*5/9;
		System.out.printf("Los grados en escala fahrenheit que me has proporcionado, en Celsius son: %.2f\n",celsius);
	}
}
