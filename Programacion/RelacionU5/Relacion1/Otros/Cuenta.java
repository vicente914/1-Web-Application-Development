public class Cuenta
{
    //Atributos
    private int ncc;
    private double saldo;

    //constructor
    public Cuenta(int ncc, double saldo)
    {
        this.ncc = ncc;
        this.saldo = saldo;
        System.out.printf("\nCuenta %d creada con saldo %.3f\n",ncc,saldo);
    }


    //metodos
    
    public void retirar(double cantidad)
    {
        saldo -= cantidad;
        System.out.printf("\nSe han retirado %f euros en de la cuenta %d", cantidad, ncc);
        
    }
    
    public void ingresar(double cantidad)
    {
        saldo += cantidad;
        System.out.printf("\nIngreso de %f euros en la cuenta %d",cantidad,ncc);
    }

    public void transferir(Cuenta destino, double cantidad)
    {
        retirar(cantidad);
        destino.ingresar(cantidad);
    }
    

    public String toString()
    {
        String salida = String.format("\nNCC: %d\nSaldo: %.2f\n",ncc,saldo);
        return salida;
    }
}