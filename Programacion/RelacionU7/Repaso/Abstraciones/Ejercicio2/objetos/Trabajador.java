package objetos;
public abstract class Trabajador{
    //Atributos
    protected String nombre;
    protected int horasTrabajadas;

    //Constructor
    public Trabajador(String nombre, int horasTrabajadas)
    {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    //Metodos
    public void mostrarInfo(){
        System.out.printf("Trabajador: %s\nHoras: %d\n",nombre,horasTrabajadas);
    }

    public abstract double calcularSalario();
}