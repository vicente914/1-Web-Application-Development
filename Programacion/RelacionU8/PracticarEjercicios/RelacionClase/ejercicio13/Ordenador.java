public class Ordenador extends Producto{
    //atributos
    private String cpu, ram, placa, almacenamiento;

    //constructor
    public Ordenador(String nombre, String marca, double precio, int stock, String cpu, String ram, String placa, String almacenamiento){
        super(nombre, marca, precio, stock);
        this.cpu = cpu;
        this.ram = ram;
        this.placa = placa;
        this.almacenamiento = almacenamiento;
    }

    //metodos
}