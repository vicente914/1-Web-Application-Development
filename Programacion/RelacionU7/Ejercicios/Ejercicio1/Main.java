import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        //Creamos un array de Figuras con longitud indicada por el parametro TIPOS
        Figura[] figuras = new Figura[Figura.TIPOS];

        //Asignamos a cada posicion del array una figura distinta
        figuras[0] = new Circulo(10);
        figuras[1] = new Cuadrado(0);
        figuras[2] = new Triangulo(3, 6);

        //Recorremos el array mostrando el area de cada figura
        for(int i = 0; i < Figura.TIPOS; i++){
            System.out.println("Area: " + figuras[i].calcularArea());
        }

        //Utilizamos polimorfismo
        try{
            ((Dibujable)figuras[1]).dibujar();    
        }
        catch(Exception e1)
        {
            System.out.println(e1);
        }


    }
}