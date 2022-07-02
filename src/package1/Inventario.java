package package1;

import java.util.*;

public class Inventario {
    
    private List <Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public boolean agregarProducto(int idProducto){
        return true;
    }
    
    public boolean eliminarProducto(int idProducto){
        return true;
    }
    
    public boolean modificarProducto(int idProducto){
        return true;
    }
}
