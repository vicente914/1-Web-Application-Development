public class Main{
    public static void main(String[] args){
        Inventario i1 = new Inventario();

        //Crear productos
        Producto p1 = new Ordenador("HP500","HP",1000.5,"Intel i5","16GB","Nvidia 125tt","1024GB");
        Producto p2 = new Telefono("Xaomi e17","Xiaomi",450.5,"1200","5G","800");
        Producto p3 = new Ordenador("HP400","HP",1000.5,"Intel i3","16GB","Nvidia 125tt","1024GB");
        Producto p4 = new Ordenador("HP300","HP",1000.5,"Intel i2","16GB","Nvidia 125tt","1024GB");
        Producto p5 = new Ordenador("HP500","HP",1000.5,"Intel i5","16GB","Nvidia 125tt","1024GB");
        //Añadimos los productos al inventario
        i1.anadirProducto(p1, 5);
        i1.anadirProducto(p2, 10);
        i1.anadirProducto(p3, 15);
        i1.anadirProducto(p4, 20);

        //mostramos el inventario
        i1.mostrarInventario();

        //actualizar un producto
        i1.actualizarStockProducto(p5, 60);
        i1.mostrarInventario();

        //borramos un producto
        i1.eliminarProducto(p4);
        i1.mostrarInventario();
    }
}