package objetos;
public class Bicicleta extends Vehiculo{
    //Atributos
    private int numPinones, kmParciales;

    //Constructor
    public Bicicleta(int kmTotales, int kmRecorridos, int numPinones, int kmParciales){
        super(kmTotales, kmRecorridos);
        this.numPinones = numPinones;
        this.kmParciales = kmParciales;
    }

    //Metodos
    public int getPinones(){
        return numPinones;
    }

    public int getKmParciales(){
        return kmParciales;
    }

    public void cambiarPinones(int numPinones){
        this.numPinones = numPinones;
        kmParciales = 0;
    }

    //Metodos añadidos para el correcto funcionamiento del menú
    public void usarBicicleta(int recorrerKM){
        kmRecorridos += recorrerKM; 
    }

    public String toString(){
        return String.format("DATOS DE LA BICICLETA\n--------------\nKilometros totales: %d\nKilometros recorridos: %d\nKilometros parciales: %d\nNumero de piñones: %d\n",kmTotales, kmRecorridos, numPinones, kmParciales);
    }
}