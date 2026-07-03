import objetos.*;
public class Main{
    public static void main(String[] args)
    {
       //Creamos Cuenta de ahorro con su constructor sin parametros
       CuentaAhorro cuentaAhorro1 = new CuentaAhorro();

       //Utilizamos los metodos SETTER para establecer sus atributos
       cuentaAhorro1.setTitular("Vicente");
       cuentaAhorro1.setCodigo("123");
       cuentaAhorro1.setCuotaMantenimiento(20);
       cuentaAhorro1.setSaldo(2600);
       cuentaAhorro1.setTipoDeInteres(0.5);

       //Creamos cuenta corriente con constructor con parametros
       CuentaCorriente cuentaCorriente1 = new CuentaCorriente("Israel", "456", 1500, 50, 30, 2);
       cuentaCorriente1.ingresar(1000);
       cuentaCorriente1.reintegrar(2200);
       cuentaCorriente1.ingresar(100);

       //Ingresamos dinero en ambas cuentas 10k
       cuentaAhorro1.ingresar(10000);
       cuentaCorriente1.ingresar(10000);
       System.out.println("Saldo de la cuenta de ahorro: "+cuentaAhorro1.getSaldo());
       System.out.println("Saldo de la cuenta corriente: "+cuentaCorriente1.getSaldo());

       //Pasamos 1K de la cuenta corriente a la cuenta de ahorro
       cuentaCorriente1.transferir(cuentaCorriente1, cuentaAhorro1, 1000);
       System.out.println();
       System.out.println("Saldo de la cuenta de ahorro: "+cuentaAhorro1.getSaldo());
       System.out.println("Saldo de la cuenta corriente: "+cuentaCorriente1.getSaldo());

        //Aplicamos las comsiones de final de mes
        cuentaCorriente1.aplicarComisiones();
        cuentaAhorro1.aplicarComisiones();

        System.out.println();
        System.out.println("Saldo de la cuenta de ahorro: "+cuentaAhorro1.getSaldo());
        System.out.println("Saldo de la cuenta corriente: "+cuentaCorriente1.getSaldo());

    }
}