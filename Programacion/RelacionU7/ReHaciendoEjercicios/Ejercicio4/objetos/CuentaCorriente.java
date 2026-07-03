package objetos;
public class CuentaCorriente extends Cuenta{
    //Atributos
    private double importePorTransaccion;
    private int numTransacciones;
    private int numTransaccionesExentas;

    //Constructor
    public CuentaCorriente(){}

    public CuentaCorriente(String titular, String codigo, double saldo, double cuotaMantenimiento, double importePorTransaccion, int numTransaccionesExentas){
        super(titular, codigo, saldo, cuotaMantenimiento);
        this.importePorTransaccion = importePorTransaccion;
        this.numTransaccionesExentas = numTransaccionesExentas;
    }

    //Metodos
    public void setImportePorTransaccion(int importePorTransaccion){
        this.importePorTransaccion = importePorTransaccion;
    }   

    public void setNumTransaccionesExentas(int numTransaccionesExentas){
        this.numTransaccionesExentas = numTransaccionesExentas;
    }

    public double getImportePorTransaccion(){
        return importePorTransaccion;
    }

    public int getNumTransaccionesExentas(){
        return numTransaccionesExentas;
    }

    @Override
    public void ingresar(double cantidad){
        numTransacciones += 1;
        super.ingresar(cantidad);
    }

    @Override
    public boolean reintegrar(double cantidad){
        numTransacciones += 1;
        super.reintegrar(cantidad);
    }
    
    @Override
    public boolean transferir(Cuenta origen, Cuenta destino, double cantidad){
        numTransacciones += 1;
        super.transferir(origen, destino, cantidad);
    }

    @Override
    public boolean aplicarComisiones(){
        if(numTransacciones > numTransaccionesExentas){
            int transaccionesSuperadas = numTransacciones - numTransaccionesExentas;
            double cobrarExtra = importePorTransaccion * transaccionesSuperadas;   
        }

        
    }
}