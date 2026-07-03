import java.util.Scanner;
public class ejercicio7
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String cad1 = "Esta es la cadena1";
		String cad2 = "Esta es la cadena2";
		
		String intermedio = cad1;
		cad1 = cad2;
		cad2 = intermedio;
		
		//RESOLUCIÓN
		System.out.println(cad1+cad2);
		
	}
}
