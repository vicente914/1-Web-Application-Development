import java.util.Scanner;

public class ejercicio1
{
  public static void main(String[] args)
  {
    //Variables y objetos
    Scanner sc = new Scanner(System.in);
    String nombre;
    
    //Resolución del problema
    System.out.printf("Dime tu nombre: ");
    nombre = sc.nextLine();
    System.out.printf("Hola "+ nombre+ " Como estas\n");
  }
}
