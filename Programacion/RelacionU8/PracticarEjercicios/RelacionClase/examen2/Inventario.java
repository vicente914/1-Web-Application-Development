import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Inventario{
    //atributos
    HashMap<String, Producto> inventario;

    //constructor
    public Inventario(){
        inventario = new HashMap<>();
    }

    //metodos
    public void anadirProducto(Producto p){
        inventario.put(p.getCodigo(), p);
    }

    public void listarProductos(){
        System.out.println("********** INVENTARIO **********");
        for(Producto e: inventario.values()){
            System.out.println(e);
        }
    }

    public void limpiarObsoletos(){
       Iterator<Map.Entry<String, Producto>> it = inventario.entrySet().iterator();
       while(it.hasNext()){
            Producto p = it.next().getValue();
            if(p.getStock() == 0){
                it.remove();
            }
       }
    }
}