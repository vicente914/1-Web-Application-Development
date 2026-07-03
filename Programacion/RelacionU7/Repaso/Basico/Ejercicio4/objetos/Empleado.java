package objetos;
public class Empleado{
    protected String nombre;
    protected int salarioBase;

    //Constructor
    public Empleado(String nombre, int salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    //Metodos
    public int calcularSalario(){
        return salarioBase;
    }
}