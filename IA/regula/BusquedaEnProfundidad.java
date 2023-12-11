import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Nodo {
    String [] hijos;
    String padre;

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    String nombre;

    public String[] getHijos() {
        return hijos;
    }

    public void setHijos(String[] hijos) {
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

public class BusquedaEnProfundidad {
    String estadoInicial = "ny";
    String estadoFinal = "la";

        List<Nodo> ListA = new Vector<>();
        List<Nodo> ListC = new Vector<>();
        Nodo ny = new Nodo();
        BusquedaEnProfundidad (){

            ny.setNombre("ny");
            ListA.add(ny);

            while (ListA.size() != 0){

                ListC.add(0,ListA.get(0));
                ListA.remove(0);
                String nodoActual = ListC.get(0).getNombre();

                if (ListC.get(0).getNombre().equals(estadoFinal)){
                    System.out.println("-----------");
                    for(int i = 0; i < ListC.size(); i++){
                        System.out.println(ListC.get(i).getNombre());
                    }
                    System.out.println("------------");
                }
                else{
                    if (nodoActual == "ny") {
                        System.out.println("Se agrega nodo");
                        Nodo aux3 = new Nodo(); aux3.setNombre("den"); aux3.setPadre("ny");
                        Nodo aux2 = new Nodo(); aux2.setNombre("tor"); aux2.setPadre("ny");
                        Nodo aux1 = new Nodo(); aux1.setNombre("chi"); aux1.setPadre("ny");
                        String [] aux = {aux1.getNombre(),aux2.getNombre(), aux3.getNombre()};
                        ListC.get(0).setHijos(aux);
                        ListA.add(0,aux3);
                        ListA.add(0,aux2);
                        ListA.add(0,aux1);
                    }
                    if (nodoActual == "chi") {
                        Nodo aux1 = new Nodo(); aux1.setNombre("den"); aux1.setPadre("chi");
                        String [] aux = {aux1.getNombre()};
                        ListC.get(0).setHijos(aux);
                        ListA.add(0,aux1);
                    }
                    if (nodoActual == "tor") {
                        Nodo aux2 = new Nodo(); aux2.setNombre("la"); aux2.setPadre("tor");
                        Nodo aux1 = new Nodo(); aux1.setNombre("cal");aux1.setPadre("tor");
                        String [] aux = {aux1.getNombre(),aux2.getNombre()};
                        ListC.get(0).setHijos(aux);
                        ListA.add(0,aux2);
                        ListA.add(0,aux1);
                    }
                    if (nodoActual == "den") {
                        Nodo aux3 = new Nodo(); aux3.setNombre("urb"); aux3.setPadre("den");
                        Nodo aux2 = new Nodo(); aux2.setNombre("la"); aux2.setPadre("den");
                        Nodo aux1 = new Nodo(); aux1.setNombre("hou"); aux1.setPadre("den");
                        String [] aux = {aux1.getNombre(),aux2.getNombre(), aux3.getNombre()};
                        ListC.get(0).setHijos(aux);
                        ListA.add(0,aux3);
                        ListA.add(0,aux2);
                        ListA.add(0,aux1);
                    }
                    if (nodoActual == "hou") {
                        Nodo aux1 = new Nodo(); aux1.setNombre("la"); aux1.setPadre("hou");
                        ListA.add(0,aux1);
                    }


                }

                if (ListC.size() != 0 && ListA.size() > 0) {
                    while ((ListA.get(0).getPadre() != ListC.get(0).getNombre())) {
                        ListC.remove(0);
                    }
                }

            }

        }


    public  static  void main (String [] args){

        new BusquedaEnProfundidad();
    }

}

