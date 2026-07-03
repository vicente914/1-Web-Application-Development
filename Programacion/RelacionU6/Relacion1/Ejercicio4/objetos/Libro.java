package objetos;

public class Libro implements Comparable <Libro>
{
    private String titulo;
    private String autor;
    private String isbn;
    private String editorial;
    private double precio;


    public Libro(String titulo, String autor, String isbn, String editorial, double precio)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.precio = precio;
    }

    //metodo toString
    public String toString(){
        return String.format("Titulo: %s\nAutor: %s\nISBN: %s\nEditorial: %s\nPrecio: %f\n",titulo,autor,isbn,editorial,precio);
    }

    //Metodo burbuja para ordenar arrays
    public static void burbuja(Libro [] array){
        //variables
        Libro aux;

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length-i-1; j++)
            {
                if(array[j].precio > array[j+1].precio)
                {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }

    //Metodo compareTo de la infertaz Comparable
    @Override
    public int compareTo(Libro libro)
    {
        int orden = 0;
        if(precio < libro.precio)
        {
            orden = -1;
        }
        else
        {
            if(precio > libro.precio)
            {
                orden = 1;
            }
        }
        return orden;
    }
}