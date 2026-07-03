public class Producto{
    //atributos
    private String nombre, marca;
    private double precio;
    private int stock;

    //constructor
    public Producto(String nombre, String marca, double precio, int stock){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    //metodos
    public String getNombre(){
        return nombre;
    }

    public int setStock(int stock){
        this.stick = stock;
    }

    public String toString(){
        return String.format("{%s, %s, %s}");
    }
}