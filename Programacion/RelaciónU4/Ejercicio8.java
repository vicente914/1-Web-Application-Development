import java.util.Scanner;
public class Ejercicio8
{
	public static void main(String[] args)
	{
		//Variables y objetos
		Scanner sc = new Scanner(System.in);
		String a ="Esto es una String", b ="Y esto también";
		String c,d;
		
		//Resolución del problema
		//Comparación
		System.out.println("Comparación");
		if(a.equals(b))
		{
			System.out.println("Son iguales.");
		}
		else
		{
			System.out.println("No son iguales");
		}
		
		//String c y d
		
		c = a+b;
		System.out.println(c);
		d = a+b;
		if(c.equals(d))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}

		//Cantidad de caraacteres de cada String
		System.out.println("Comprobamos la cantidad de caracteres de cada String.")
		System.out.println("String a: "+a.length());
		System.out.println("String b: "+b.length());
		System.out.println("String c: "+c.length());
		System.out.println("String d: "+d.length());

		//Copiamos el string a en b
		System.out.println("Copiamos el string a en el string b");
		a=b;

		//Utilizamos  replace

		//Presentamos en consola el contenido de String a y b
		System.out.printf("El contenido de String a es %s\nEl contenido de String b es %s\n",a,b);
	}
}