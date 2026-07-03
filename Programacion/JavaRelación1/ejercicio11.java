import java.util.Scanner;
public class ejercicio11
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		
		//Resolución de problemas
		System.out.print("Dime tu primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Dime tu segundo número: ");
		numero2 = sc.nextInt();
		
		System.out.printf("La distancia absoluta entre estos dos valores es %d\n", Math.abs(numero1-numero2));
	}
}
