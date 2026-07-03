import objetos.*;

public class Main{
    public static void main(String[] args)
    {
        //Objetos
        try{
            //Motocicleta moto1 = new Motocicleta("Vicente");
            Motocicleta moto2 = new Motocicleta(300, 900, "1234LZZ");

        
            //Ejecutamos los metodos SET
        /*    System.out.printf("\nLa Motocicleta 1:\n");
            moto1.setCv(500);
            moto1.setKilometrosHoras(1500);
            moto1.setMatricula("4433KGG");
            
            //Ejecutamos los metodos GET de la motocicleta 1
        
            System.out.println();
            System.out.println("Caballos de potencia: "+moto1.getCV());
            System.out.println("Kilometros hora maximos: "+moto1.getKilometrosHora());
            System.out.println("Matricula: "+moto1.getMatricula());
        */
            //Ejecutamos los metodos GET de la motocicleta 2
            System.out.printf("\nLa Motocicleta 2:\n");
            System.out.println();
            System.out.println("Caballos de potencia: "+moto2.getCV());
            System.out.println("Kilometros hora maximos: "+moto2.getKilometrosHora());
            System.out.println("Matricula: "+moto2.getMatricula());
        }

        catch(Exception exception){
            System.out.println(exception);
        }
        
    }
}