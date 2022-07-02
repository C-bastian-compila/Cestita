package package1;

import java.util.*;

public class ColeccionListas {
    
    private List <ListaProductos> listas;
    private List <ListaProductos> listasCompletadas;


    public ColeccionListas() {
        this.listas = new ArrayList<ListaProductos>();
        this.listasCompletadas = new ArrayList<ListaProductos>();
    }
    
    public List<ListaProductos> getListas() {
        return listas;
    }

    public void setListas(List<ListaProductos> listas) {
        this.listas = listas;
    }

    public List<ListaProductos> getListasComp() {
        return listasCompletadas;
    }

    public void setListasComp(List<ListaProductos> listasCompletadas) {
        this.listasCompletadas = listasCompletadas;
    }
    
    public boolean crearListaProductos (String nombreLista){
        return true;
    }
    
    public boolean eliminarLista (String nombreLista){
        return true;
    }
    
    public boolean renombrarLista (String nombreLista){
        return true;
    }
    
    public ListaProductos buscarLista (String nombreLista){
        return null;
    }
    
    public ListaProductos buscarListaComp (String nombreLista){
        return null;
    }
    
    public int getCantListas(){
        return listas.size();
    }
    
    public ListaProductos getLista(int posicion){
        return listas.get(posicion);
    }
}
