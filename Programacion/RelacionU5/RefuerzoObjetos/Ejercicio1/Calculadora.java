public class Calculadora
{
    private int operando1;
    private int operando2;

    public Calculadora(int operando1, int operando2)
    {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar()
    {
        System.out.printf("%d + %d = %d\n",operando1, operando2, (operando1+operando2));
    }

    public void restar()
    {
        System.out.printf("%d - %d = %d\n",operando1, operando2, (operando1-operando2));
    }

    public void multiplicar()
    {
        System.out.printf("%d * %d = %d\n",operando1, operando2, (operando1*operando2));
    }
}