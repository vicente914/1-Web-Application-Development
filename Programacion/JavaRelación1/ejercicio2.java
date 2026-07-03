import java.util.Scanner;

public class ejercicio2
{
  public static void main (String[] args)
  {
    //Variable y objetos
    Scanner sc = new Scanner(System.in);
    double perimetro, area, base, altura;
    
    //Resolución del problema
    System.out.print("Dime la base de tu rectangulo: ");
    base = sc.nextDouble();
    System.out.print("Dime la altura de tu rectangulo: ");
    altura = sc.nextDouble();
    
    perimetro = 2*(base+altura);
    area = base*altura;
    
    System.out.printf("El perimetro de tu rectangulo es %.2f y su area es %.2f\n",perimetro, area);
  }
  
}
