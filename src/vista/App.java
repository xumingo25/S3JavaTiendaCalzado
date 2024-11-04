package vista;

import modelo.Deportivo;

import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

public class App {
    public static void main(String[] args) {

        Producto prod = new Producto("123abc", 10, 10000); //CONSTRUCTOR VACIO

        Deportivo deportivo = new Deportivo(prod,"semana",44,"Futbol","Lona");

        Hombre hombre = new Hombre(prod,"Fin de semana",37,"verde");

        Mujer mujer = new Mujer (prod,"Semana",36,"Rojo",15);

        System.out.println("Impuesto IVA Calzado Deportivo: "+ deportivo.impuestoIVA());
        System.out.println("Impuesto IVA Calzado Mujer: "+ mujer.impuestoIVA());
        System.out.println("Impuesto IVA Calzado Hombre: "+ hombre.impuestoIVA());

        System.out.println("Impuesto Especifico mujer: "+mujer.impuestoEspecifico());
        System.out.println("Impuesto Especifico hombre: "+hombre.impuestoEspecifico());
        System.out.println("Impuesto Material: "+deportivo.impuestoMaterial());

        System.out.println("descuento Calzado mujer "+ mujer.descuento());
        System.out.println("descuento Calzado hombre "+ hombre.descuento());

        System.out.println("Valor venta Calzado Deportivo "+deportivo.valorVenta());
        System.out.println("Valor venta Calzado Mujer "+mujer.valorVenta());
        System.out.println("Valor venta Calzado Hombre "+hombre.valorVenta());

        System.out.println("Valor a cancelar Calzado Deportivo "+deportivo.valorACancelar());
        System.out.println("Valor a cancelar Calzado Mujer "+mujer.valorACancelar());
        System.out.println("Valor a cancelar Calzado Hombre "+hombre.valorACancelar());

        System.out.println("Ingresa codigo de calzado");
        String codCalzado = Leer.dato();

        System.out.println("Ingrese nro de calzado");
        int nroCalzado = Leer.datoInt();

        System.out.println("nro: "+nroCalzado);
        System.out.println("codigo: "+codCalzado);
    }
}
