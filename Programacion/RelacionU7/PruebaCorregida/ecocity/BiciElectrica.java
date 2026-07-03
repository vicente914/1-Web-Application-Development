package ecocity;
public class BiciElectrica extends Vehiculo{
    //atributos
    private boolean incluyeCasco;
    
    //constructor
    public BiciElectrica(String idVehiculo, String marca, double tarifaBaseDiaria, boolean incluyeCasco){
        super(idVehiculo, marca, tarifaBaseDiaria);
        this.incluyeCasco = incluyeCasco;
    }
    //metodos

    @Override
    public String toString(){
        return super.toString() + String.format("Incluye casco: %b",incluyeCasco);
    }

    @Override
    public double calcularCosteAlquiler(int dias){
        double aPagar = tarifaBaseDiaria * dias;
        if(incluyeCasco){
            aPagar += aPagar*0.1;
        }
        return aPagar;
    }
}