import objetos.*;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        //Variables y objetos
        final int N_LIBROS = 3;

        //Array con libros
        Libro[] libros = new Libro[N_LIBROS];

        //Creamos los libros

        Libro libro1 = new Libro("El Quijote","Cervantes","1","Planeta",30.0);
        Libro libro2 = new Libro("La vicentada","Vicente","2","Grupo Anagrama",18.55);
        Libro libro3 = new Libro("Java para principiantes","Anonimo","3","Sintesis",20.95);


        //Añadimos los libros al array
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;

        //Ordenamos por precio de menor a mayor
        //Libro.burbuja(libros);

        //Ordenar con Array.sort
        Arrays.sort(libros);

        //Mostramos por pantalla
        for(int i = 0; i < libros.length;i++)
        {
            System.out.printf("\nLibro %d\n%s\n",i+1,libros[i]);
        }
    }
}