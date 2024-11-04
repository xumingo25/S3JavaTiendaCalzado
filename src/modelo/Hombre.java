package modelo;

public class Hombre extends Formal{
    public Hombre(Producto producto, String diaVenta, int numero, String color) {
        super(producto, diaVenta, numero, color);
    }

    //definir la logica para un calzado formal de hombre
    //o	Si el calzado es de hombre y de color es “Rojo” o “Verde el descuento será de un 25%
    @Override
    public int descuento() {
        int descuento = 0;
        if(this.color.equalsIgnoreCase("rojo") ||
                this.color.equalsIgnoreCase("verde")){
            descuento = valorVenta()/4;
        }
        return descuento;
    }

}
