package objetos;
public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Metodos
    @Override
    public double calcularArea(){
        area = (base * altura) / 2;
        area *= 100;
        area = Math.round(area);
        area /= 100;
        return area;
    }
}