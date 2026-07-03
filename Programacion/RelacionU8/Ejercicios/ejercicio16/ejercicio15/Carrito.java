import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
public class Carrito{
    //atributos
    LinkedList<ItemCarrito> carrito;

    //constructor
    public Carrito(){
        carrito = new LinkedList<>();
    }

    //metodos
    public void anadirArticulo(ItemCarrito nuevo){
        if(carrito.contains(nuevo)){
            carrito.get(carrito.indexOf(nuevo)).aumentarCantidad();
        }
        else{
            carrito.add(nuevo); /*Añadimo la clave(string) y el valor(articulo)*/
        }
    }


    public void imprimirCarrito(){
        double pvp=0;
        System.out.println("\n**** CARRITO ****");
        for(ItemCarrito item : carrito){
            System.out.println(item);
            pvp += item.getArticulo().getPrecio() * item.getCantidad();
        }
        System.out.printf("%25s: %.2f€\n","P.V.P", pvp);
    }

    public void resumenFinal(){
        double pvp=0;
        System.out.println("\n**** CARRITO INVERTIDO ****");
        ListIterator<ItemCarrito> it = carrito.listIterator(carrito.size());
        while(it.hasPrevious()){
            ItemCarrito item = it.previous();
            System.out.println(item);
            pvp += item.getArticulo().getPrecio() * item.getCantidad();
        }
        System.out.printf("%25s: %.2f€\n","P.V.P", pvp);
    }


    public void imprimirCarritoOrdenado(){
        Collections.sort(carrito);
        imprimirCarrito();
    }


    public void validar(){
        System.out.println("********** VALIDACIÓN **********");
        //Recorremos el carrito buscando items no validos con un iterator
        ListIterator<ItemCarrito> it = carrito.listIterator();

        while(it.hasNext()){
            ItemCarrito tmp = it.next();
            //Caso 1: stock 0
            if(tmp.getArticulo().getDisponibilidad() == 0){
                System.out.println(tmp.getArticulo().getNombre() + " no esta disponible");
                System.out.println("Se añade una tarjeta regalo10");
                it.set(new ItemCarrito(new Articulo("ROO2", "Tarjeta Regalo10",-10,50)));
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

            //Si es rato gaming añado funda regalo
            if(tmp.getArticulo().getNombre().equals("Ratón Gaming")){
                it.add(new ItemCarrito(new Articulo("R001","Funda regalo",0,100)));
                System.out.println("Se ha añadido un regalo");
            }
        }
    }
}