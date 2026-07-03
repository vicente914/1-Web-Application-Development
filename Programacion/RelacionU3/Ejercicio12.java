import java.util.Scanner;
public class Ejercicio12
{
	public static void main(String[] args)
	{
		//Variables y Objetos
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		boolean mesCorrecto, diaCorrecto;
		
		//Resolución del problema
		
		System.out.print("Dime el año para la fecha: ");
		year = sc.nextInt();
		System.out.print("Dime el mes para la fecha: ");
		month = sc.nextInt();
		System.out.print("Dime el dia para la fecha: ");
		day = sc.nextInt();
		
		mesCorrecto = month <= 12 && month >= 1;
		diaCorrecto = day <= 31 && day >= 1;
		
		if(mesCorrecto && diaCorrecto)
		{
		  System.out.printf("La fecha introducida %d/%d/%d es correcta\n",day,month,year);
		}
		else
		{
		  System.out.println("La fecha introducidad no es correcta/no existe");
		}
	}
}
