import java.util.TreeMap;
public class Inventario{
    //Atributos
    private TreeMap<String, Producto> inventario;

    //Constructor
    public Inventario(){
        inventario = new TreeMap<>();
    }

    //metodos
    public void anadirProducto(Producto p, int cantidad){
        inventario.put(p.getNombre(), p);
        p.setStock(cantidad);
    }

    public void mostrarInventario(){
        System.out.println("***** MOSTRAR INVENTARIO *****");
        String salida = String.format("%-10s | %-6s | %-8.2s | %-8s |\n","NOMBRE","MARCA","PRECIO","STOCK");
        salida += "--------------------------------------------------";
        System.out.println(salida);
        for(Producto p: inventario.values()){
            System.out.println(p);        }
    }

    
    public void actualizarStockProducto(Producto p, int nueva_cantidad){
        Producto tmp = inventario.get(p.getNombre());
        if(tmp != null){
            tmp.setStock(nueva_cantidad);
            System.out.println("Stock actualizado: "+tmp.getNombre()+"("+nueva_cantidad+")");
        }
        else{
            System.out.println("El producto no está en el inventario");
        }
    }

   /*public void actualizarStockProducto(Producto p, int nueva_cantidad){
        if(inventario.get(p.getNombre()) != null){//Si está en el inventario
            p.setStock(nueva_cantidad);
            System.out.println("Stock actualizado: "+p.getNombre()+"("+nueva_cantidad+")");
        }
        else{
            System.out.println("El producto no está en el inventario");
        }
    }*/

   public void eliminarProducto(Producto p){
        if(inventario.remove(p.getNombre()) != null){
            System.out.println(p.getNombre() + "borrado");
        }
        else{
            System.out.println("El producto no está en el inventario");
        }
   }
}