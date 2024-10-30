package modelo;

public class Calzado {
    protected Producto producto;
    protected String diaVenta;
    protected int numero;

    public Calzado(Producto producto, String diaVenta, int numero) {
        this.producto = producto;
        this.diaVenta = diaVenta;
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Por construir
    //•	valorVenta: retornará el valor de venta del calzado,
    // sabiendo que el fin de semana, aumenta en un 24% el
    // valor Base y en la semana el valor Base disminuye en un 15%.
    public int valorVenta(){
        return 0;
    }
}
