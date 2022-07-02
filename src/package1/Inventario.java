package package1;

import java.util.*;

public class Inventario {
    
    private List <Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<Producto>();
    }

    public List<Producto> getProductos() {
        return productos;
    }
    

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public int getCantProductos(){
        return productos.size();
    }
    
    public Producto getProducto(int posicion){
        return productos.get(posicion);
    }

    
    public boolean agregarProducto(int idProducto){
        return true;
    }
    
    public boolean eliminarProducto(int posicion){
         
         if(productos.remove(posicion) != null) return true;
        return false;
    }
    
    public boolean modificarProducto(int idProducto){
        return true;
    }
}
