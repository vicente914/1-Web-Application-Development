public class Ordenador extends Producto{
    //atributos
    private String cpu, ram, placa, almacenamiento;

    //constructor
    public Ordenador(String nombre, String marca, double precio, String cpu, String ram, String placa, String almacenamiento){
        super(nombre, marca, precio);
        this.cpu = cpu;
        this.ram = ram;
        this.placa = placa;
        this.almacenamiento = almacenamiento;
    }

    //metodos
    @Override
    public String toString(){
        String salida = String.format("%-10s | %-10s | %-10s | %-10s |",cpu, ram, placa, almacenamiento);
        return super.toString()+salida;
    }
}