import java.util.Scanner;

public class ejercicio3
{
  public static void main (String[] args)
  {
    //Variable y objetos
    Scanner sc = new Scanner (System.in);
    double cateto1, cateto2, hipotenusa;
    
    //Resolución del problema
    System.out.print("Dime cuanto mide el primer cateto: ");
    cateto1 = sc.nextDouble();
    System.out.print("Dime cuanto mide el segundo cateto: ");
    cateto2 = sc.nextDouble();
    
    hipotenusa = Math.pow(cateto1,2) + Math.pow(cateto2,2);
    
    System.out.printf("La hipotenusa de tu triangulo rectangulo es %.2f\n",hipotenusa);
  }
}
