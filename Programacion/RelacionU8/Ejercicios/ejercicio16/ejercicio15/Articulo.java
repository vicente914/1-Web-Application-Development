public class Articulo{
    //Atributos
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
    public String getNombre(){
        return nombre;
    }

    public String getId(){
        return id;
    }

    public double getPrecio(){
        return precio;
    }

    public int getDisponibilidad(){
        return disponibilidad;
    }

    @Override
    public String toString(){
        return String.format("{%s, %s, %.2f€, %d}", id, nombre, precio, disponibilidad);
    }
}