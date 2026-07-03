public class Telefono extends Producto{
    //atributos
    private String bateria, senal;
    private int autonomia;

    //constructor
    public Telefono(String nombre, String marca, double precio, int stock, String bateria, String senal, int autonomia){
        super(nombre, marca, precio, stock);
        this.bateria = bateria;
        this.senal = senal;
        this.autonomia = autonomia;
    }
}