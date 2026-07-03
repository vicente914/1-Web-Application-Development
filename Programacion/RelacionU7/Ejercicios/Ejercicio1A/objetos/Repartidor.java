package objetos;
public class Repartidor extends Empleado{
    private int entregasRealizadas = 10;
    private final double pagoPorEntrega = 20;

    //Metodos
    @Override
    public double calcularPago(){
        double extra = entregasRealizadas * pagoPorEntrega;
        return salarioBase + extra;
    }
}