import java.util.Scanner;
public class ejercicio5
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String usuario;
		String contraseña;
		
		//Resolución del problema
		System.out.print("Introduce tu nombre de usuario:");
		usuario = sc.nextLine();
		
		System.out.print("Introduce la contraseña de usuario:");
		contraseña = sc.nextLine();
		
		
		if(usuario.equals("pepe") && contraseña.equals("asdasd"))
		{
		  System.out.println("Has entrado al sistema");
		}
		else
		{
		  System.out.println("ERROR: usuario o contraseña incorrectos");
		}
	}
}

