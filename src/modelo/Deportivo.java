package modelo;

import java.util.Locale;

public class Deportivo extends Calzado {
    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(Producto producto, String diaVenta, int numero, String tipoDeporte, String tipoMaterial) {
        super(producto, diaVenta, numero); //constructor de la superClase
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    //•	impuestoMaterial: retornará el valor de impuesto de material el cual es
    // un 15% del valor base si el calzado es de Cuero
    // y de un 6% del valor base si es de Lona
    public int impuestoMaterial(){
        int impuestoMaterial = 0;
        switch (this.getTipoMaterial().toLowerCase()){
            case "cuero":
                impuestoMaterial = (int) (this.getProducto().getValorBase()*0.15);
                break;
            case "lona":
                impuestoMaterial = (int) (this.getProducto().getValorBase()*0.06);
                break;
            default:
                break;
        }
        return impuestoMaterial;
    }

    @Override
    public int valorACancelar() {
        int valorAPagar;
        if(this.producto.getStock()>0){
            valorAPagar = valorVenta() + impuestoIVA() + impuestoMaterial();
        }else{
            System.out.println("No hay Stock");
            valorAPagar = -1;
        }
        return valorAPagar;
    }


}
