import objetos.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
        //Arraylist
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        Rectangulo rect1 = new Rectangulo(10, 5);
        Rectangulo rect2 = new Rectangulo(5, 2);
        Circulo circ1 = new Circulo(5);
        Circulo circ2 = new Circulo(10);

        //añadimos las figuras a nuestro array list
        figuras.add(rect1);
        figuras.add(rect2);
        figuras.add(circ1);
        figuras.add(circ2);

        //System.out.println(figuras.get(0));
        for(int i = 0; i < figuras.size(); i++){
            System.out.println("Area de la figura: " + figuras.get(i).calcularArea());
        }
    }
}