import java.util.LinkedHashMap;
import java.util.Iterator;
public class Carrito{
    //atributos
    LinkedHashMap<String, ItemCarrito> carrito;

    //constructor
    public Carrito(){
        carrito = new LinkedHashMap<>();
    }

    //metodos
    public void anadirArticulo(ItemCarrito nuevo){
        if(carrito.containsKey(nuevo.getArticulo().getId())){
            ItemCarrito tmp = carrito.get(nuevo.getArticulo().getId());
            tmp.aumentarCantidad();
        }
        else{
            carrito.put(nuevo.getArticulo().getId(), nuevo); /*Añadimo la clave(string) y el valor(articulo)*/
        }
    }


    public void imprimirCarrito(){
        double pvp=0;
        System.out.println("\n**** CARRITO ****");
        for(ItemCarrito item : carrito.values()){
            System.out.println(item);
            pvp += item.getArticulo().getPrecio() * item.getCantidad();
        }
        System.out.printf("%25s: %.2f€\n","P.V.P", pvp);
    }


    public void validar(){
        System.out.println("********** VALIDACIÓN **********");
        //Recorremos el carrito buscando items no validos con un iterator
        Iterator<ItemCarrito> it = carrito.values().iterator();

        while(it.hasNext()){
            ItemCarrito tmp = it.next();
            //Caso 1: stock 0
            if(tmp.getArticulo().getDisponibilidad() == 0){
                System.out.println(tmp.getArticulo().getNombre() + " no esta disponible");
                it.remove();
            }

            //precio 0 o negativo
            if(tmp.getArticulo().getPrecio() <= 0 && !tmp.getArticulo().getNombre().contains("DESCUENTO")){
                System.out.println(tmp.getArticulo().getNombre() + "ERROR de precio");
                it.remove();
            }

            //cupones caducados
            if(tmp.getArticulo().getNombre().startsWith("EXP")){
                System.out.println(tmp.getArticulo().getNombre() + "Cupón caducado");
                it.remove();
            }
        }
    }
}