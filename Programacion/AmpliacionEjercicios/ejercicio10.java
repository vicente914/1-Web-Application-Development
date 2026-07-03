import java.util.Scanner;
public class ejercicio10
{
  public enum razas {Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo}
	public static void main(String[] args)
	{
		//variables y objetos
		Scanner sc = new Scanner(System.in);
		razas var1 = razas.Bulldog;
		razas var2 = razas.Terrier;
		String comparar;
		
		int posicion1 = var1.ordinal();
		int posicion2 = var2.ordinal();
		
		//RESOLUCIÓN
		System.out.println("La raza de var1 es: " +var1);
		System.out.println("La raza de var2 es: " +var2);
		comparar = (var1 == var2) ? "Son misma raza":"Son distintas razas";
		System.out.println(comparar);
		System.out.println("La posicion del primer perro es: " +posicion1);
		System.out.println("La posicion del segundo perro es: " +posicion2);
	}
}
