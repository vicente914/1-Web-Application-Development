package objetos;
public class EmpleadoComision extends Trabajador{
    //Atributos
    private double ventasRealizadas;
    private double porcentajeComision;

    //Constructores
    public EmpleadoComision(String nombre, int horasTrabajadas, double ventasRealizadas, double porcentajeComision){
        super(nombre, horasTrabajadas);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    //Metodos implementados
    @Override
    public double calcularSalario(){
        return ventasRealizadas * (porcentajeComision / 100);
    }
}