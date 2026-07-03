import java.util.Arrays;
public class ArrayGenerico<T>{
    //Atributos
    private Object[] array;
    
    //Constructor
    public ArrayGenerico(int capacidad){
        this.array = new Object[capacidad];
    }
    
    //Metodos
    public String buscarValor(T valor){
        int posicion = -1;
        for(int i = 0; i < array.length; i++){
            if(valor == array[i]){
                posicion = i;
            }
        }
        return String.format("Busco el %d: %d",valor, posicion);
    }

    public void anadirElemento(T elemento) throws Exception{
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                array[i] = elemento;
                return;
            }
        }
        throw new Exception("El array esta lleno");
    }


    public void limpiarArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = null;
        }
    }

    public void mostrarArray(){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }


    //Probamos funcionamiento con el Main
    public static void main(String[] args){
        //Creamos un arrayGenercio de 10 integer
        ArrayGenerico <Integer> array1 = new ArrayGenerico<>(10);

        try{
            array1.anadirElemento(50);
            array1.anadirElemento(30);
            System.out.println(array1);

            System.out.println(array1.buscarValor(20));
            System.out.println(array1.buscarValor(30));
            array1.anadirElemento(100);
        }
        catch (Exception e){
            System.out.println(e);
        } 

        System.out.println("**** Valores ****");
        array1.mostrarArray();
    }
}