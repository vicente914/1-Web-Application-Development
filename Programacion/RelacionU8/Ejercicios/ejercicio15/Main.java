public class Main{
    public static void main(String[] args){

        Carrito c1 = new Carrito();

        //añadimos items al carrito
        Articulo a1 = new Articulo("P001","Teclado Mecánico", 45.50, 12);
        ItemCarrito i1 = new ItemCarrito(a1);
        c1.anadirArticulo(i1);


        //c1.imprimirCarrito();

        Articulo a2 = new Articulo("P002", "Ratón Gaming", 15.0, 5);
        Articulo a3 = new Articulo("P003", "EXP-DESCUENTO10", -10.0, 1);
        Articulo a4 = new Articulo("P004", "Monitor 4K", 350.00, 0);
        Articulo a5 = new Articulo("P005", "Alfombrilla XL", 0.0, 20);

        ItemCarrito i2 = new ItemCarrito(a2);
        ItemCarrito i3 = new ItemCarrito(a3);
        ItemCarrito i4 = new ItemCarrito(a4);
        ItemCarrito i5 = new ItemCarrito(a5);

        c1.anadirArticulo(i2);
        c1.anadirArticulo(i3);
        c1.anadirArticulo(i4);
        c1.anadirArticulo(i5);
        c1.anadirArticulo(i1);


        c1.imprimirCarrito();

        c1.validar();
        c1.imprimirCarrito();



        
    }
}