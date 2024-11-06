package vista;

import controlador.TiendaCalzado;
import modelo.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int opcion; //1,2,3,4,5,6,7
        String codigoCalzado; //123abc

        TiendaCalzado tiendaCalzado = new TiendaCalzado(new ArrayList<>()); // 0

        do{
           //se ejecuta el bloque
           opcion = menu();

           switch (opcion){
               case 1: // Ingresar Calzado
                   //Solicitar ino de calzado
                   codigoCalzado = pideCodigo();
                   if(tiendaCalzado.buscarCalzado(codigoCalzado)==-1){
                       //solicitar info
                       System.out.println("¿Stock?"); int stock = Leer.datoInt();
                       System.out.println("¿Valor Base?"); int valorBase = Leer.datoInt();

                       String diaVenta;
                       do{ //Lunes
                           System.out.println("Favor ingrese dia de venta (Semana o Fin de semana)");
                            diaVenta= Leer.dato();
                       }while(diaVenta.compareToIgnoreCase("Semana")!=0 &&
                       diaVenta.compareToIgnoreCase("Fin de semana") !=0);

                       System.out.println("favor ingrese talla del calzado...");
                       int numero= Leer.datoInt();

                       int respuesta;
                       do{
                           System.out.println("\n¿El calzado es: 1) Deportivo   2) Formal Hombre   3) Formal Hombre");
                           System.out.println("Favor ingrese una opción para continuar...");
                           respuesta = Leer.datoInt();
                       }while(respuesta < 1 || respuesta > 3);

                       if(respuesta==1){
                           //Calzado Deportivo
                           System.out.println("¿Tipo deporte?"); String tipoDeporte = Leer.dato();

                           String tipoMaterial;
                           do {
                               System.out.println("Favor ingrese tipo de material (Cuero o Lona)");
                               tipoMaterial = Leer.dato();
                           }while(tipoMaterial.compareToIgnoreCase("Cuero")!=0 &&
                                   tipoMaterial.compareToIgnoreCase("Lona") !=0);

                           Producto prod = new Producto(codigoCalzado,stock,valorBase);
                           Deportivo deportivo = new Deportivo(prod,diaVenta,numero,tipoDeporte,tipoMaterial);

                           tiendaCalzado.ingresarCalzadoDeportivo(deportivo);
                       }else{
                           System.out.println("Favor ingresar color del calzado..."); String color = Leer.dato();
                            if(respuesta == 2){
                                //Hombre
                                tiendaCalzado.ingresarCalzadoHombre
                                        (new Hombre
                                                (new Producto(codigoCalzado,stock,valorBase),diaVenta,numero,color));

                            }else{
                                //Mujer
                                System.out.println("Favor ingrese altura de taco..."); int alturaTaco = Leer.datoInt();

                                tiendaCalzado.ingresarCalzadoMujer
                                        (new Mujer
                                                (new Producto(codigoCalzado,stock,valorBase),diaVenta,numero,color,alturaTaco));
                            }
                       }
                       System.out.println("Calzado cod:"+codigoCalzado + " agregado correctamente");
                   }
                   break;
               case 2: // Calzados Mujer
                   System.out.println(tiendaCalzado.calzadosMujer());
                   break;
               case 3: // Valor Venta
                   String codigoSolicitado = pideCodigo();
                   System.out.println(tiendaCalzado.valorVenta(codigoSolicitado));
                   break;
               case 4: // Calzados Top
                   System.out.println(tiendaCalzado.calzadosTop());
                   break;
               case 5: // Total Impuestos Especificos
                   System.out.println("El total de impuesto especificos en pesos" +
                           " si se vendieran todos los calzados es: "+
                           tiendaCalzado.totalImpuestos());
                   break;
               case 6: // Total Descuentos
                   System.out.println("El descuento total en pesos" +
                           " si se vendieran todos los calzados es: "+
                           tiendaCalzado.totalDescuentos());
                   break;
           }
        }while(opcion!=7); //se evalua y si da verdadero

    }

    public static String pideCodigo(){
        System.out.println("Favor ingrese codigo del calzado...");
        return Leer.dato();
    }

    public static int menu(){
        System.out.println("Sistema Tienda Calzado");
        System.out.println("1.\tIngresar Calzado (mujer, hombre o deportivo y sin duplicado).");
        System.out.println("2.\tMostrar sólo los calzado de mujer.");
        System.out.println("3.\tValor Venta");
        System.out.println("4.\tCalzados top");
        System.out.println("5.\tTotal Impuesto Especifico");
        System.out.println("6.\tTotal descuento");
        System.out.println("7.\tSalir");
        System.out.println("---------------------------");
        System.out.println("Favor ingrese una opción para continuar... (1 o 2,3...etc)");
        return Leer.datoInt();
    }


}
