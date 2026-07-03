import java.util.Scanner;
public class ejercicio6
{
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		double numero1, numero2, numero3, media;
		
		//Resolución del problema
		System.out.print("Dime el primer numero con el que vamos a hacer media: ");
		numero1 = sc.nextDouble();
		System.out.print("Dime el segundo: ");
		numero2 = sc.nextDouble();
		System.out.print("Dime el tercero: ");
		numero3 = sc.nextDouble();
		
		media = (numero1+numero2+numero3)/3;
		System.out.printf("La media de los tres números proporcionados es %.2f\n",media);
	}
}
