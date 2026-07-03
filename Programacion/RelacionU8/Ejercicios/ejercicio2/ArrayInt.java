import java.util.Arrays;
public class ArrayInt{
    //Atributos
    private int[] datos;
    
    //Constructor
    public ArrayInt(int capacidadMax){
        this.datos = new int[capacidadMax];
    }

    //Metodos
    
    public boolean setValorDePosicion(int valor, int posicion){
        boolean datosGuardados = false;
        if(posicion >= 0 && posicion < datos.length){
            datos[posicion] = valor;
            datosGuardados = true;
        }
        return datosGuardados;
    }

    public String getValorDePosicion(int posicion){
        return String.format("Posición %d: %d",posicion, datos[posicion]);
    }

    @Override
    public String toString(){
        return Arrays.toString(datos);
    }

    public static void main(String[] args){
        ArrayInt array1 = new ArrayInt(5);
        array1.setValorDePosicion(25,0);
        array1.setValorDePosicion(0,1);
        array1.setValorDePosicion(0,2);
        array1.setValorDePosicion(18,3);
        array1.setValorDePosicion(0,4);
        System.out.println(array1);
        
        System.out.println(array1.getValorDePosicion(0));
    }

}