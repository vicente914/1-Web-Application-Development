public abstract class Producto{
    //atributos
    protected String nombre, marca;
    protected double precio;  
    protected int stock;

    //constructor
    public Producto(String nombre, String marca, double precio){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    //metodos
    public String getNombre(){
        return nombre;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    @Override
    public String toString(){
        return String.format("%-10s | %-6s | %-8.2f | %-8d |", nombre, marca, precio, stock);
    }
}