package objetos;
public class EmpleadoFijo extends Trabajador{
    //Atributos
    private double salarioPorHora;

    //Constructor
    public EmpleadoFijo(String nombre, int horasTrabajadas, double salarioPorHora){
        super(nombre, horasTrabajadas);
        this.salarioPorHora = salarioPorHora;
    }

    //metodos
    @Override
    public double calcularSalario(){
        double salario = horasTrabajadas * salarioPorHora;
        return salario;
    }
}