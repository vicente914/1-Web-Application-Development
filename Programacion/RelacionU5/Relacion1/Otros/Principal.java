import java.util.Scanner;
public class Principal{
    public static void main(String[] args)
    {
        //Objetos y variables
        Scanner sc = new Scanner(System.in);
        int opcion;

        //Menú

        do
        {
            System.out.println("***** MENÚ *****");
            System.out.println("(1).- Concatenar cadenas");
            System.out.println("(0).- Salir");
            
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if(opcion == 1)
            {
                System.out.print("Introduce tu primera cadena para concatenar: ");
                String cadena1 = sc.nextLine();
                System.out.print("Introduce tu segunda cadena para concatenar: ");
                String cadena2 = sc.nextLine();
                System.out.println(StringYArray.concatenarCadenas(cadena1,cadena2));
            }

        }while(opcion != 0);
    }
}