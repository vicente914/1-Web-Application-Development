import java.util.Scanner;
public class ejercicio9
{
  public static void main(String[] args)
  {
    //variables y objetos
    Scanner sc = new Scanner(System.in);
    double compra, descuento, totalCompra;
    //Resolución de problemas
    System.out.print("Dime cuanto cuesta tu compra: ");
    compra = sc.nextDouble();
    System.out.print("Dime de cuanto es el cupón de descuento que tienes: ");
    descuento = sc.nextDouble();
    
    descuento = (compra*descuento)/100;   
    totalCompra = compra-descuento;
    System.out.printf("El precio final de la compra con el descuento son %.2f\n",totalCompra);
  }
}
