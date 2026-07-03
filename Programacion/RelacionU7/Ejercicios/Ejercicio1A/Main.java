import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        //Empleado empleado1 = new Empleado();
        Gerente gerente = new Gerente();
        Repartidor repartidor1 = new Repartidor();

       // System.out.println("Empleado sueldo: "+empleado1.calcularPago());
        System.out.println("Repartidor sueldo: "+repartidor1.calcularPago());
        System.out.println("Gerente sueldo: "+gerente.calcularPago());
    }
}