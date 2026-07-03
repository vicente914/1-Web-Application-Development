import java.util.Scanner;
public class switch2
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		char nota;
		
		//Resolución del problema
		System.out.print("Introduce tu nota: ");
		nota = sc.nextLine().toUpperCase().charAt(0);
		
		switch(nota)
		{
		  case 'A':
		    System.out.println("Excelente");
		    break;
		  case 'B':
		    System.out.println("Notable");
		    break;
		  case 'C':
		    System.out.println("Aprobado");
		    break;
		  case 'D':
		    System.out.println("Insuficiente");
		    break;
		  case 'F':
		    System.out.println("Reprobado");
		    break;
		  default:
		    System.out.println("La nota introducida no existe");
		}
	}
}
