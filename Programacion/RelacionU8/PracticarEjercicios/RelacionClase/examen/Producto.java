public abstract class Producto{
    //atributos
    protected String nombre, codigo;
    protected double precio;
    protected int stock;

    public Producto(String nombre, String codigo, double precio, int stock){
       
        if(!codigo.matches("[A-Z]{2}[0-9]{4}")){
            throw new IllegalArgumentException("Error Formato Código");
        }
        else{
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }
    }

    @Override
    public String toString(){
        return String.format("%-20s | %15s |%15.2f| %10d|",nombre, codigo, precio, stock);
    }

    public abstract String etiqueta();

    public String getNombre(){
        return nombre;
    }

    public int getStock(){
        return stock;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     public void setCodigo(String codigo){
        this.codigo = codigo;
    }

     public void setPrecio(double precio){
        this.precio = precio;
    }

     public void setStock(String stock){
        this.nombre = nombre;
    }
}