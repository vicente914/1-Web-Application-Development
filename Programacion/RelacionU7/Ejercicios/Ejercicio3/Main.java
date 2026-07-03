import objetos.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        //Creamos una bicicleta y un coche
        Scanner sc = new Scanner(System.in);
        Coche coche1 = new Coche(5000, 0, 1.7, 15);
        Bicicleta bici1 = new Bicicleta(3500, 0, 10, 30);

        System.out.println("OPCIONES-VEHÍCULOS");
        System.out.println("================================");
        System.out.println("1. Rodar con bicicleta 10 km");
        System.out.println("2. Cambiar piñones");
        System.out.println("3. Ver kilometraje de la bicicleta (parcial/total)");
        System.out.println("4. Ver información completa de la bicicleta");
        System.out.println("5. Rodar con coche 10000 km");
        System.out.println("6. Revisar un coche");
        System.out.println("7. Ver kilometraje del coche (parcial/total)");
        System.out.println("8. Saber los kilómetros que restan para la revisión del coche");
        System.out.println("9. Ver información completa del coche");
        System.out.println("10. Ver el número de vehículos creados");
        System.out.println("11. Ver kilometraje total de todas los vehículos creados");
        System.out.println("12. Salir");
        System.out.println("================================");
        System.out.println("Elige una opción del menú: ");
        int opcion = sc.nextInt();

        switch(opcion)
        {
            case 1:
                System.out.println("Kilometros de bicicleta antes de usarla: "+bici1.getKmRecorridos());
                bici1.usarBicicleta(10);
                System.out.println("Kilometros de bicicleta despues de usarla: "+bici1.getKmRecorridos());
                break;
            
            case 2: 
                System.out.println("Piñones actuales: "+bici1.getPinones());
                bici1.cambiarPinones(12);
                System.out.println("Piñones cambiados: "+bici1.getPinones());
                break;
            
            case 3:
                System.out.println("Kilometros parciales: "+bici1.getKmParciales());
                System.out.println("Kilometros totales: "+bici1.getKmTotales());
                break;
                
            case 4:
                System.out.println(bici1.toString());
                break;
            
            case 5:
                System.out.println("Kilometros de coche antes de usarla: "+coche1.getKmRecorridos());
                coche1.usarCoche(10000);
                System.out.println("Kilometros de coche despues de usarla: "+coche1.getKmRecorridos());
                break;

            case 6:
                coche1.revisar();
                System.out.println("Revisión completada");
                break;
                
            case 7:
                System.out.println("Kilometros parciales: "+coche1.getKmParciales());
                System.out.println("Kilometros totales: "+coche1.getKmTotales());
                break;

            case 8:
                System.out.println("Restan "+coche1.saberKmRevision()+" kilometros para su proxima revisión");
                break;

            case 9:
                System.out.println(coche1.toString());
                break;

            default:
                System.out.println("Opción introducidad inexistente, introduzca una opción del menú.");
            
        }
    }
}