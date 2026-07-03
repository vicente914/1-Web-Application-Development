package compraonline;
public class Vendedor{
    //Atributos
    private String nombre;
    private Producto[] productosEnVenta;
    private int idVendedor;
    private static int contadorVendedores = 0;

    //Constructor
    public Vendedor(String nombre){
        this.nombre = nombre;
        contadorVendedores++; //Cada instancia aumentara el contador
        this.idVendedor = contadorVendedores; //se asignara el valor del contador a la nueva instancia
        this.productosEnVenta = new Producto[5];
    }

    //Metodos GETTER
    public String getNombre(){
        return nombre;
    }

    public int getID(){
        return idVendedor;
    }

    //Metodos para añadir productos
    public boolean anadirProducto(Producto producto){
        boolean productoAnadido = true;
        for(int i = 0; i < productosEnVenta.length; i++){
            if(productosEnVenta[i] == null){
                productosEnVenta[i] = producto;
                productoAnadido = true;
            }
            else{
                productoAnadido = false;
            }
        }
        return productoAnadido; 
    }

    //Metodos para eliminar productos
    public boolean eliminarProducto(String producto){
        boolean productoEliminado = false;
        for(int i = 0; i < productosEnVenta.length; i++){
            if(productosEnVenta[i].getNombre().equals(nombre)){
                productosEnVenta[i] = null;
                productoEliminado = true;
            }
            else{
                productoEliminado = false;
            }
        }
        return productoEliminado;
    }

    //Metodo para buscar producto
    public Producto buscarProducto(String producto){
        Producto productoEncontrado = null;
        for(int i = 0; i < productosEnVenta.length; i++){
            if(productosEnVenta[i].getNombre().equals(producto)){
                productoEncontrado = productosEnVenta[i];
            }
        }
        return productoEncontrado;
    }

    //Metodo listar los productos
    

}