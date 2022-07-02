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
    
    public boolean crearListaProductos(ListaProductos lista){
        
        if(!this.existeLista(lista.getNombreLista())) {
            this.listas.add(lista);
            return true;
        }
        return false;
    }
    public boolean existeLista(String nombreLista ) {
        
        for(int i = 0; i < listas.size(); i++){

            if(listas.get(i).getNombreLista().equals(nombreLista)) return true;
        }
        return false;
    
    }
    public boolean eliminarLista (int posicion){
        if(listas.remove(posicion) != null) return true;
        return false;
    }
    
    public boolean renombrarLista (String nombreLista){
        return true;
    }
    
    public ListaProductos buscarLista (String nombreLista){
        
        for(int i = 0; i < listas.size(); i++){

            if(listas.get(i).getNombreLista().equals(nombreLista)) return listas.get(i);
        }
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
