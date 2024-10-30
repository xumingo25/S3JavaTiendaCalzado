package modelo;

public class Formal extends Calzado{
    protected String color;

    public Formal(Producto producto, String diaVenta, int numero, String color) {
        super(producto, diaVenta, numero);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
