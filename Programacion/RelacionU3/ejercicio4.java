import java.util.Scanner;
public class ejercicio4
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		//Resolución del problema
		System.out.print("Dime el primer número de nuestra división: ");
		num1 = sc.nextInt();
		System.out.print("Dime ahora el segundo número de nuestra división: ");
		num2 = sc.nextInt();
		if(num2 == 0)
		{
		  System.out.println("No es posible dividir entre 0");
		}
		else
		{
		  System.out.println("El resultado de la división es: "+(num1/num2));
		}
	}
}
