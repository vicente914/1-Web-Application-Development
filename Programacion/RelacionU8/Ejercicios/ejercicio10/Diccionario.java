import java.util.HashMap;
import java.util.Map;
public class Diccionario{
    public static void main(String[] args){
        //Creamos la colección
        HashMap<String, String> diccionario = new HashMap<>();

        //Añadimos 5 palabras a la coleccion
        diccionario.put("hola","hello");
        diccionario.put("adios", "bye");
        diccionario.put("mesa", "table");
        diccionario.put("lapiz","pen");
        diccionario.put("silla","chair");


        //Mostramos diccionar

        //Mostramos el diccionario
        mostrarDiccionario(diccionario);

        //Buscamos la palabra en castellano y pasamos su traduccion en ingles
        String aBuscar = "hola";
        if(diccionario.get(aBuscar) != null){
            System.out.printf("Buscamos %s: %s\n", aBuscar, diccionario.get("hola"));
        }
        else{
            System.out.println("No se encuentra la palabra en el diccionario");
        }


        //Buscamos y eliminamos una palabra del diccionario
        if(diccionario.remove(aBuscar) != null){
            System.out.printf("Borramos %s",aBuscar);
        }
        else{
            System.out.println("No se ha podido borrar");
        }
        System.out.println();

        //Mostramos el diccionario
        mostrarDiccionario(diccionario);
    }


    //Creamos un metodo para mostrar el diccionario
    public static void mostrarDiccionario(HashMap<String,String> h){
        for(Map.Entry<String, String> e : h.entrySet()){
            System.out.printf("%-7s --> %-7s\n",e.getKey(), e.getValue());
        }
    }
}