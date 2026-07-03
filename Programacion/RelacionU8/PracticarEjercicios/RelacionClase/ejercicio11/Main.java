import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        
        //Creamos cada tipo de mapa
        
        
        Provincia p1 = new Provincia("GR","Granada",18);
        Provincia p2 = new Provincia("J","Jaen",23);
        Provincia p3 = new Provincia("AL","Almeria",04);
        Provincia p4 = new Provincia("CO","Cordoba",14);
        Provincia p5 = new Provincia("SE","Sevilla",41);
        Provincia p6 = new Provincia("MA","Malaga",29);
        Provincia p7 = new Provincia("CA","Cadiz",11);
        Provincia p8 = new Provincia("H","Huelva",21);

        Map<Integer, Provincia> hash = new HashMap<>();
        System.out.println("***** HASHMAP ******");
        hash.put(p1.getCodPostal(),p1);
        hash.put(p2.getCodPostal(),p2);
        hash.put(p3.getCodPostal(),p3);
        hash.put(p4.getCodPostal(),p4);
        hash.put(p5.getCodPostal(),p5);
        hash.put(p6.getCodPostal(),p6);
        hash.put(p7.getCodPostal(),p7);
        hash.put(p8.getCodPostal(),p8);
        hash.put(p1.getCodPostal(),p1);

        for(Map.Entry<Integer, Provincia> m: hash.entrySet()){
            System.out.println(m);
        }


        System.out.println();
        System.out.println("***** LinkedHashMap *****");
        Map<Integer, Provincia> linked = new LinkedHashMap<>(hash);
        imprimirMap(linked);


        System.out.println();
        System.out.println("***** TreeMap *****");
        Map<Integer, Provincia> tree = new TreeMap<>(hash);
        imprimirMap(tree);

    }

    public static void imprimirMap(Map<Integer, Provincia> map){
        for(Map.Entry<Integer, Provincia> m: map.entrySet()){
            System.out.println(m);
        }
    }
}