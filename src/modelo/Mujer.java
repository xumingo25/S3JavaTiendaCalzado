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

    ////o	Si la altura del taco es mayor a 10, el descuento será de un 20% del valor venta
    @Override
    public int descuento() {
        int descuento = 0;
        if(this.alturaTaco > 10){
            descuento = valorVenta()/5;
        }
        return descuento;
    }

}
