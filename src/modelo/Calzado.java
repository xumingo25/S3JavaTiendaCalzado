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
}
