import java.util.Scanner;

public class ejercicio14
{
	public static void main (String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		int dosCifras, cifra1, cifra2;
		
		//Resolvemos el problema
		System.out.print("Dime tu número de dos cifras: ");
		dosCifras = sc.nextInt();
		
		cifra1 = dosCifras/10;
		cifra2 = dosCifras%10;
		
		System.out.printf("El número invertido es: %d%d\n", cifra2, cifra1);
		
		
		
	}
}
