package objetos;
public class Gerente extends Empleado{
    private int bono;

    //Constructor
    public Gerente(String nombre, int salarioBase, int bono){
        super(nombre, salarioBase);
        this.bono = bono;
    }

    //Metodos
    @Override
    public int calcularSalario(){
        return salarioBase + bono;
    }
}