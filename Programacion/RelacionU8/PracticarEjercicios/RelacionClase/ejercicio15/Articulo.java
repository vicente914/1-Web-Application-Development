public class Articulo{
    //atributos
    private String id, nombre;
    private double precio;
    private int disponibilidad;

    //constructor
    public Articulo(String id, String nombre, double precio, int disponibilidad){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    //metodos
    public String getId(){
        return id;
    }
}