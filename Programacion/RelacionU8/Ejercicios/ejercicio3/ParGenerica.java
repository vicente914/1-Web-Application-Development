public class ParGenerica<T,V>{
    //Atribtuos
    private final T CLAVE;
    private final V VALOR;
    
    //Constructor
    public ParGenerica(T clave, V valor){
        this.CLAVE = clave;
        this.VALOR = valor;
    }
    //Metodos
    public T getClave(){
        return CLAVE;
    }

    public V getValor(){
        return VALOR;
    }

    @Override
    public String toString(){
        return String.format("{%s,%s}",CLAVE,VALOR);
    }

    public static void main(String[] args){
        ParGenerica <String, Integer> par1 = new ParGenerica<>("Jaen",23);
        System.out.println(par1);

        ParGenerica <Character, Double> par2 = new ParGenerica<>('a',25.34);
        System.out.println(par2);
    }
}