package modelo;

public class Mujer extends Formal{
    private int alturaTaco;

    public Mujer(Producto producto, String diaVenta, int numero, String color, int alturaTaco) {
        super(producto, diaVenta, numero, color);
        this.alturaTaco = alturaTaco;
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
