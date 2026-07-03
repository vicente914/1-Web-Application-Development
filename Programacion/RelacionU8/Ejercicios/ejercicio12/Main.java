import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Main{
    public static void main(String[] args){
        
        //Instanciamos las provincias
        Provinciav2 p1 = new Provinciav2("GR","Granada",18);
        Provinciav2 p2 = new Provinciav2("J","Jaen",23);
        Provinciav2 p3 = new Provinciav2("AL","Almeria",04);
        Provinciav2 p4 = new Provinciav2("CO","Cordoba",14);
        Provinciav2 p5 = new Provinciav2("SE","Sevilla",41);
        Provinciav2 p6 = new Provinciav2("MA","Malaga",29);
        Provinciav2 p7 = new Provinciav2("CA","Cadiz",11);
        Provinciav2 p8 = new Provinciav2("H","Huelva",21);

        //Creamos los tres tipos de mapa posibles
        HashMap<Provinciav2, Integer> provinciasHash = new HashMap<>();
        provinciasHash.put(p1, p1.getCodigoPostal());
        provinciasHash.put(p2, p2.getCodigoPostal());
        provinciasHash.put(p3, p3.getCodigoPostal());
        provinciasHash.put(p4, p4.getCodigoPostal());
        provinciasHash.put(p5, p5.getCodigoPostal());
        provinciasHash.put(p6, p6.getCodigoPostal());
        provinciasHash.put(p7, p7.getCodigoPostal());
        provinciasHash.put(p8, p8.getCodigoPostal());
        provinciasHash.put(p1, p1.getCodigoPostal());

        LinkedHashMap<Provinciav2, Integer> provinciasLinked = new LinkedHashMap<>();
        provinciasLinked.put(p1, p1.getCodigoPostal());
        provinciasLinked.put(p2, p2.getCodigoPostal());
        provinciasLinked.put(p3, p3.getCodigoPostal());
        provinciasLinked.put(p4, p4.getCodigoPostal());
        provinciasLinked.put(p5, p5.getCodigoPostal());
        provinciasLinked.put(p6, p6.getCodigoPostal());
        provinciasLinked.put(p7, p7.getCodigoPostal());
        provinciasLinked.put(p8, p8.getCodigoPostal());
        provinciasLinked.put(p1, p1.getCodigoPostal());

        TreeMap<Provinciav2, Integer> provinciasTree = new TreeMap<>();
        provinciasTree.put(p1, p1.getCodigoPostal());
        provinciasTree.put(p2, p2.getCodigoPostal());
        provinciasTree.put(p3, p3.getCodigoPostal());
        provinciasTree.put(p4, p4.getCodigoPostal());
        provinciasTree.put(p5, p5.getCodigoPostal());
        provinciasTree.put(p6, p6.getCodigoPostal());
        provinciasTree.put(p7, p7.getCodigoPostal());
        provinciasTree.put(p8, p8.getCodigoPostal());
        provinciasTree.put(p1, p1.getCodigoPostal());

        System.out.println("HASHMAP");
        System.out.println("--------------------------------------------");
        System.out.println(provinciasHash);
        System.out.println("--------------------------------------------");
        System.out.println("LinkedHashMap");
        System.out.println("--------------------------------------------");
        System.out.println(provinciasLinked);
        System.out.println("--------------------------------------------");
        System.out.println("TreeMap");
        System.out.println("--------------------------------------------");
        System.out.println(provinciasTree);
    }

    public static void imprimirMap(Map<Provincia, Integer> m){
        for(Provincia p : m.values()){
            System.out.println(p);
        }
    }
}