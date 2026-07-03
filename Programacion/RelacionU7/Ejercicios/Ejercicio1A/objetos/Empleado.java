package objetos;
public  abstract class Empleado{
    protected String nombre;
    protected double salarioBase = 1700;

    //Metodos
    public abstract double calcularPago();
}