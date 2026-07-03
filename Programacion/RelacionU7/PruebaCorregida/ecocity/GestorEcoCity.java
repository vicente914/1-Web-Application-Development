package ecocity;
public class GestorEcoCity{
    public static void main(String[] args){
        
        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new CocheElectrico("1","Seat", 150, "100%");
        vehiculos[1] = new CocheElectrico("2","Tesla", 200, "100%");

        vehiculos[2] = new BiciElectrica("3", "Trek", 50, true);
        vehiculos[3] = new BiciElectrica("4","Mondraker", 50, false);

        System.out.println("***************** INFORME **********************");
        for(int i = 0; i < vehiculos.length; i++){
            if(vehiculos[i] != null)
            {
                System.out.println(vehiculos[i]);
                System.out.println("Coste por 7 dias de alquiler: "+vehiculos[i].calcularCosteAlquiler(7));
                System.out.println("**********************************************");
            }
               
        }
    }
}