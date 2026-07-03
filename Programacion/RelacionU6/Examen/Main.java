import compraonline.*;
public class Main{
    public static void main(String[] args)
    {
        //Creamos tres productos
        try{
            Producto prod1 = new Producto("Patín","Juguetos","30/3/2023");
            Producto prod2 = new Producto("Peluche","Juguetilandia","25/2/2026");
            Producto prod3 = new Producto("Figura","Juguetos","23/10/2025");
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        

    }
}