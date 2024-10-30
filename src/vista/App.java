package vista;

import modelo.Deportivo;

import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

public class App {
    public static void main(String[] args) {
        //tipodato      nombreV = valor;
        int numero = 100;

        //Tipodato      nombreO = new constructor();
        Producto prod = new Producto("123abc", 5, 10000); //CONSTRUCTOR VACIO

        System.out.println("Stock del producto:" +prod.getStock());

        System.out.println("info prod:");
        System.out.println("Codigo: "+prod.getCodigo());
        System.out.println("Stock: "+prod.getStock());

        prod.setStock(10);
        System.out.println("Stock del producto:" +prod.getStock());

        Deportivo deportivo = new Deportivo(prod,"Semana",44,"Futbol","Cuero");

        Hombre hombre = new Hombre(prod,"Fin de semana",37,"verde");

        Mujer mujer = new Mujer (prod,"Semana",36,"Rojo",5);

        System.out.println("nro calzado deportivo: "+deportivo.getNumero());
    }
}
