package objetos;
import java.util.regex.*;
public class CuentaCorriente extends Cuenta{
    //Atributos
    private double importePorTransaccion;
    private int numTransacciones;
    private int numTransaccionesExentas;

    //Constructores
    public CuentaCorriente(){}

    public CuentaCorriente(String titular, String codigo, double saldo, double cuotaMantenimiento, double importePorTransaccion,int numTransaccionesExentas){
        super(titular, codigo, saldo, cuotaMantenimiento);
        this.importePorTransaccion = importePorTransaccion;
        this.numTransaccionesExentas = numTransaccionesExentas;
    }


    //Metodos SETTER
    public void setImportePorTransaccion(double importePorTransaccion){
        this.importePorTransaccion = importePorTransaccion;
    }

    public void setNumTransaccionesExentas(int numTransaccionesExentas){
        this.numTransaccionesExentas = numTransaccionesExentas;
    }

    //Metodo GETTER
    public double getImportePorTransaccion(){
        return importePorTransaccion;
    }

    public int getNumTransaccionesExentas(){
        return numTransaccionesExentas;
    }

    //Metodos operaciones con la cuenta
    @Override
    public void ingresar(double cantidad){
        numTransacciones += 1;
        super.ingresar(cantidad);
    }

    @Override
    public boolean reintegrar(double cantidad){
        numTransacciones += 1;
        return super.reintegrar(cantidad);
    }

    @Override
    public boolean transferir(Cuenta origen, Cuenta destino, double cantidad){
        numTransacciones += 1;
        return super.transferir(origen, destino, cantidad);
    }

    @Override
    public boolean aplicarComisiones(){
        if(numTransacciones > numTransaccionesExentas){
            int transaccionesSuperadas = numTransacciones - numTransaccionesExentas;
            double cobrarExtra = transaccionesSuperadas * importePorTransaccion;
        }
        return super.aplicarComisiones();
        
    }
}