package ecocity;
public class CocheElectrico extends Vehiculo{
    //Atributos
    private String nivelBateria;

    //constructor
    public CocheElectrico(String idVehiculo, String marca, double tarifaBaseDiaria, String nivelBateria){
        super(idVehiculo, marca, tarifaBaseDiaria);
        this.nivelBateria = nivelBateria;
    }

    //Metodos
    @Override
    public String toString(){
        return super.toString() + String.format("Nivel de Bateria: %s\n");
    }

    @Override
    public double calcularCosteAlquiler(int dias){
        double aPagar = tarifaBaseDiaria * dias;
        if(dias > 5){
            aPagar -= aPagar*0.1;
        }
        return aPagar;
    }
}