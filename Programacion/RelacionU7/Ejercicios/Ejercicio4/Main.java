import objetos.*;
public class Main{
    public static void main(String[] args){
        
        //Instanciamos las clases hijas desde la clase padre, ejemplo de polimorfismo claro
        Publicacion [] publicaciones = new Publicacion[3];
        publicaciones[0] = new Libro("123456", "La Ruta Prohibida", 2007);
        publicaciones[1] = new Revista("444555", "Anio Cero", 2019, 344);
        publicaciones[2] = new Publicacion("456789", "La rosa del mundo", 1995);

        //Utilizamos un bucle para recorrer el array creado.
        for(int i=0;i<3;i++)
            System.out.println(publicaciones[i]);
        System.out.println();

        //Primer prestamo
        //Realizamos un casting para poder utilizar el método de la subclase desde la clase padre, este es otro ejemplo de polimorfismo
        ((Libro)publicaciones[0]).prestar();
        if (((Libro)publicaciones[0]).estaPrestado()) {
        System.out.println("El libro esta prestado\n");
        }

        //Segundo prestamo
        publicaciones[1].prestar();
        if (((Libro)publicaciones[1]).estaPrestado()) {
        System.out.println("El libro esta prestado\n");
        }
        
        

        //Tercer prestamo
        publicaciones[2].prestar();
        if (((Libro)publicaciones[2]).estaPrestado()) {
        System.out.println("El libro esta prestado\n");
        }

        
        /* 
        1. ¿Se usa el polimorfismo en este código? Si es así ¿donde se usa?
        Si que se utiliza polimofismo en este código, se utiliza a la hora de crear las instancias de 
        nuestros objetos y en el primer prestamo donde utilizamos un metodo de una clase hija desde la clase
        padre.

        2. ¿Por qué fallan los tres prestamos? ¿Se podría solucionar alguno de ellos?
        Fallan porque los tres estan intentando utilizar un metodo de la Interfaz Prestable que solo
        Libro posee y aparte el objeto Libro falla porque no tiene bien implementado el casting.

        Se podría solucionar SOLAMENTE el primer prestamo mediante casting(ya esta corregido en el código)
        
        */

    }
}