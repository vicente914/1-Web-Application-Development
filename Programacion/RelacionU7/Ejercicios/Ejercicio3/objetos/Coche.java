package objetos;
public class Coche extends Vehiculo{
    //Atributos
    private double cilindrada;
    private int kmParciales;
    private int revision = 1500;

    //Constructor
    public Coche(int kmTotales, int kmRecorridos, double cilindrada, int kmParciales){
        super(kmTotales, kmRecorridos);
        this.cilindrada = cilindrada;
        this.kmParciales = kmParciales;
    }

    //Metodos
    public double getCilindrada(){
        return cilindrada;
    }

    public int getKmParciales(){
        return kmParciales;
    }

    public int saberKmRevision(){
        return revision;
    }

    public void revisar(){
        kmParciales = 0;
    }

    //Métodos añadidos para el correcto funcionamiento del menú
    public void usarCoche(int recorrerKM){
        kmRecorridos += recorrerKM;
    }

    public String toString(){
        return String.format("DATOS DEL COCHE\n------------------\nKilometros totales: %d\nKilometros Recorridos: %d\nCilindrada: %.2f\nKilometros Parciales: %d\n",kmTotales, kmRecorridos, cilindrada, kmParciales);
    }
}