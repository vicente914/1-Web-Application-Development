public class ItemCarrito implements Comparable<ItemCarrito>{
    //atributos
    private int cantidad;
    private Articulo articulo;
    
    //constructor
    public ItemCarrito(Articulo articulo){
        this.articulo = articulo;
        this.cantidad = 1;
    }

    //metodos
    public Articulo getArticulo(){
        return articulo;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void aumentarCantidad(){
        this.cantidad++;
    }

    @Override
    public String toString(){
        return String.format("%-20s - (x%d) %.2f€",articulo.getNombre(), cantidad, articulo.getPrecio()*cantidad);
    }

    @Override
    public int compareTo(ItemCarrito otro){
        return Double.compare(otro.getArticulo().getPrecio(), this.getArticulo().getPrecio());
    }
}