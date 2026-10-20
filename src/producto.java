public class producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;

    public producto(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public void mostrarInformacion() {
        System.out.println("Producto ID: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
