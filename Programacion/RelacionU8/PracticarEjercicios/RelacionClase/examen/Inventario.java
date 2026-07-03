import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
public class Inventario{
    //atributos
    LinkedList<Producto> lista;
    Scanner sc = new Scanner(System.in);

    public Inventario(){
        lista = new LinkedList<>();
    }

    //metodos

    public void anadirProducto(Producto p){
        lista.add(p);
    }

    public void listarProductos(){
        Iterator<Producto> it = lista.iterator();
        System.out.println("****************************** INVENTARIO ********************************");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


    public void limpiarObsoletos(){
        Iterator<Producto> it = lista.iterator();
        while(it.hasNext()){
            Producto p = it.next();
            String codigo = p.getCodigo();
            if(p.getStock() == 0){
                it.remove();
                System.out.println("Artículo "+codigo+" borrado por falta de objetos");
            }
        }
    }

    public void getEtiquetas(){
        for(Producto p: lista){
            System.out.println(p.etiqueta());
        }
    }
}