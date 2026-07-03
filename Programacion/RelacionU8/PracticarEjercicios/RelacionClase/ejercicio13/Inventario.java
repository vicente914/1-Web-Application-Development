import java.util.TreeMap;
public class Inventario{
    TreeMap<String, Producto> inventario;

    //constructor
    public Inventario(){
        inventario = new TreeMap<>();
    }

    //metodos
    public void anadirProducto(Producto producto, int cantidad){
        inventario.put(producto.getNombre(), producto);
    }

    public void actualizaStockProducto(Producto producto, int nueva_cantidad){
        String tmp = inventario.get(producto.getNombre());
        if(tmp != null){
            tmp.setStock(nueva_cantidad);
            System.out.println("cantidad actualizada");
        }
        else{
            System.out.println("No existe ese producto en nuestro inventario");
        }
    }

    public void eliminarProducto(Producto producto){
        if(inventario.remove(producto.getNombre()) != null){
            System.out.println(producto.getNombre() + "fue borrado exitosamente");
        }
        else{
            System.out.println("No se pudo encontrar el objeto");
        }
    }


    public void mostrarInventario(){
        for(Map.Entry<String, Producto> c: inventario){
            System.out.println(c);
        }
    }
}