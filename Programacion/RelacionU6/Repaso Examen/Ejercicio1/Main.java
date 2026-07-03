import objetos.*;
public class Main{
    public static void main(String[] args)
    {
        //Instanciamos dos objetos moto distintos, cada uno con un constructor distinto
        try{
            Motocicleta moto1 = new Motocicleta();
            Motocicleta moto2 = new Motocicleta(200, 350, "1234LZZ");


            //Establecemos los valores de la moto1 y los mostramos
            System.out.println("Esta es la moto1\nEstos son sus datos: ");
            moto1.setMatricula("1234WWW");
            moto1.setCv(300);
            moto1.setVelocidadPunta(400);

            //Mostramos los datos
            System.out.println(moto1.getCv());
            System.out.println(moto1.getVelocidadPunta());
            System.out.println(moto1.mostrarMatricula());


            //MOTO2 mostramos datos
            System.out.println("---------------------------------");
            System.out.println("Esta es la moto2\nEstos son sus datos: ");
            System.out.println(moto2.getCv());
            System.out.println(moto2.getVelocidadPunta());
            System.out.println(moto2.mostrarMatricula());



        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        
        
    }
}