public class Telefono extends Producto{
    //atributos
    private String bateria;
    private String senal;
    private String autonomia;

    //constructor
    public Telefono(String nombre, String marca, double precio, String bateria, String senal, String autonomia){
        super(nombre, marca, precio);
        this.bateria = bateria;
        this.senal = senal;
        this.autonomia = autonomia;
    }

    //metodos
    @Override
    public String toString(){
        String salida = String.format("%-8.2s | %-10s | %-12.2s |",bateria, senal, autonomia);
        return super.toString()+salida;
    }
}