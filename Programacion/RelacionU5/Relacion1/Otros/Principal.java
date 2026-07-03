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
            System.out.println("Introduce una opcion: ");
            opcion = sc.nextInt();

            if(opcion == 1)
            {
                System.out.println("Introduce tu primera cadena para concatenar: ");
                String cadena1 = sc.nextLine();
                System.out.println("Introduce tu segunda cadena para concatenar: ");
                String cadena2 = sc.nextLine();
                System.out.println(StringYArray.concatenarCadenas("Me llamo ","Vicente."));
            }

        }while(opcion != 0);
    }
}