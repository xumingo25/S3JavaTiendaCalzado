package controlador;


import modelo.Calzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;

import java.util.ArrayList;

public class TiendaCalzado {
    //atributos
    ArrayList<Calzado> tiendaCalzado;

    //métodos
    public ArrayList<Calzado> getTiendaCalzado() {
        return tiendaCalzado;
    }

    public void setTiendaCalzado(ArrayList<Calzado> tiendaCalzado) {
        this.tiendaCalzado = tiendaCalzado;
    }

    public TiendaCalzado(ArrayList<Calzado> tiendaCalzado) {
        this.tiendaCalzado = tiendaCalzado;
    }

    //Buscar un calzado

    //Arralist{objeto1,objeto2,objeto3,objeto4
    //            0   ,   1   ,   2   ,   3
    //          Mujer , Hombre, Mujer , Deportivo
    //          123   , asdb  , qwe12 , 54321

    public int buscarCalzado(String codCalzado){ //asfsdfsdfdb
        for(int i=0; i< tiendaCalzado.size();i++){
            //lista - elemento - caracteristica - evaluo
            if(tiendaCalzado.get(i).getProducto().getCodigo().compareToIgnoreCase(codCalzado)==0){
                //encontre el calzado
                return i;
            }
        }
        return -1;
    }

    //Ingresar Calzados de mujer
    public void ingresarCalzadoMujer(Mujer mujer){
        if(buscarCalzado(mujer.getProducto().getCodigo())==-1){
            //no existe un calzado asociado
            tiendaCalzado.add(mujer);
        }
    }

    //Ingresar Calzados de hombre
    public void ingresarCalzadoHombre(Hombre hombre){
        if(buscarCalzado(hombre.getProducto().getCodigo())==-1){
            //no existe un calzado asociado
            tiendaCalzado.add(hombre);
        }
    }

    //Ingresar Calzados deportivos
    public void ingresarCalzadoDeportivo(Deportivo deportivo){
        if(buscarCalzado(deportivo.getProducto().getCodigo())==-1){
            //no existe un calzado asociado
            tiendaCalzado.add(deportivo);
        }
    }

    //Arralist{objeto1,objeto2,objeto3,objeto4
    //            0   ,   1   ,   2   ,   3
    //          Mujer , Hombre, Mujer , Deportivo
    //          123   , asdb  , qwe12 , 54321
    public String calzadosMujer(){
        String mensaje = "";
        Mujer mujer = null;
        for(int i=0; i< tiendaCalzado.size();i++){ //iterar en la colección
            if(tiendaCalzado.get(i) instanceof Mujer){
                //es un calzado de mujer
                mujer = (Mujer) tiendaCalzado.get(i);

                mensaje = mensaje + "\n dia de venta: "+mujer.getDiaVenta()+ " , Altura taco: "+
                        mujer.getAlturaTaco() + " y descuento: $"+mujer.descuento();
            }
        }
        return mensaje;
    }

    public String valorVenta(String cod){
        for(int i=0; i< tiendaCalzado.size();i++) { //iterar en la colección
            if(tiendaCalzado.get(i).getProducto().getCodigo().compareToIgnoreCase(cod)==0){
                //encontre el calzado a mostrar
                return "El valor venta del calzado es: $"+tiendaCalzado.get(i).valorVenta() +
                        " y la talla del calzado es: "+ tiendaCalzado.get(i).getNumero();
            }
        }
        return "El codigo "+cod + " no esta asociado a ningun calzado :/";
    }

    public String calzadosTop(){
        int suma= 0;
        for(int i=0; i< tiendaCalzado.size();i++) { //iterar en la colección
            if(tiendaCalzado.get(i).valorVenta()>80000){
                suma = suma + tiendaCalzado.get(i).getProducto().getStock();
            }
        }
        return "tienes "+suma + " calzados top (valor mayor a $80.000) Ojo :D";
    }

    public int totalImpuestos(){
        int total = 0;
        Mujer m = null;
        Hombre h = null;

        for(int i=0; i< tiendaCalzado.size();i++) { //iterar en la colección
            if(tiendaCalzado.get(i) instanceof Mujer){
                m = (Mujer) tiendaCalzado.get(i);
                total = total + (m.impuestoEspecifico() * m.getProducto().getStock());
            }else if(tiendaCalzado.get(i) instanceof Hombre){
                h= (Hombre) tiendaCalzado.get(i);
                total = total + (h.impuestoEspecifico() * h.getProducto().getStock());
            }
        }
        return total;
    }

    public int totalDescuentos(){
        int total = 0;
        Mujer m = null;
        Hombre h = null;

        for(int i=0; i< tiendaCalzado.size();i++) { //iterar en la colección
            if(tiendaCalzado.get(i) instanceof Mujer){
                m = (Mujer) tiendaCalzado.get(i);
                total = total + (m.descuento() * m.getProducto().getStock());
            }else if(tiendaCalzado.get(i) instanceof Hombre){
                h= (Hombre) tiendaCalzado.get(i);
                total = total + (h.descuento() * h.getProducto().getStock());
            }
        }
        return total;
    }

}
