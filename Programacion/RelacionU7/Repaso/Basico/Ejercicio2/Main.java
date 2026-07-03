import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        Vehiculo vehiculo1 = new Vehiculo();
        Coche coche1 = new Coche();
        Bicicleta bici1 = new Bicicleta();

        //metodos
        vehiculo1.mover();
        coche1.mover();
        bici1.mover();
    }
}