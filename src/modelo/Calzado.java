package modelo;

public abstract class Calzado {
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
    public int valorVenta(){ //valorBase 10000 FDS = 12400 S = 8500
        int valorVenta = -1;

        if(this.diaVenta.equalsIgnoreCase("Semana")){
            //se vendio en la semana - 15%
            valorVenta = this.producto.getValorBase() - Math.round(this.producto.getValorBase()*15/100);
        }else if(this.diaVenta.equalsIgnoreCase("Fin de semana")){
            //se vendio el fin de semana + 24%
            valorVenta = this.producto.getValorBase() + Math.round(this.producto.getValorBase()*24/100);
        }
        return valorVenta;
    }

    //•	impuestoIva: retornará el valor por concepto de IVA que es el 19% del valor venta
    public int impuestoIVA(){
        return (int) Math.round(this.valorVenta()*0.19);
        //el cast es definir de manera explicita el tipo de dato de una variable / expression
    }

    public abstract int valorACancelar();
}
