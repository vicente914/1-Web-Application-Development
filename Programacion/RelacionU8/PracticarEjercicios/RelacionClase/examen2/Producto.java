public abstract class Producto{
    //atributos
    protected String nombre, codigo;
    protected double precio;
    protected int stock;

    public Producto(String nombre, String codigo, double precio, int stock)throws Exception{
        if(!codigo.matches("[A-Z]{2}[0-9]{4}")){
            throw new Exception("Error Formato Código");
        }
        else{
            this.nombre = nombre;
            this.codigo = codigo;
            this.precio = precio;
            this.stock = stock;
        }
        
    }

    //metodos
    @Override
    public String toString(){
        return String.format("%-10s|%5s|%5.2f€|%5d",nombre,codigo,precio,stock);
    }

    public String getCodigo(){
        return codigo;
    }

    public int getStock(){
        return stock;
    }
}