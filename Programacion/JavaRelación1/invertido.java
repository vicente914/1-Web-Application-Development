import java.util.Scanner;
public class invertido
{
  public static void main(String[] args)
  {
  //Variables y objetos
    Scanner sc = new Scanner(System.in);
    int numero, digito1, digito2, digito3, intermedio;
    //Resolución
    System.out.print("Dime un numero: ");
    numero = sc.nextInt();
    
    digito1 = numero/100;
    intermedio = numero/10;
    digito2 = intermedio%10;
    digito3 = numero%10;
    
    System.out.printf("El numero invertido es: %d%d%d\n", digito3,digito2,digito1);
    
    
  }
}
