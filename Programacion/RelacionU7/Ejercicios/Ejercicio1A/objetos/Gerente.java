package objetos;
public class Gerente extends Empleado{
    private double bono = 500;

    //Metodos
    @Override
    public double calcularPago(){
        return salarioBase + bono;
    }
}