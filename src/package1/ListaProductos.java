package package1;

import java.io.*;
import java.util.*;

public class ListaProductos {
    
    private List <Producto> productos;
    private String nombreLista;
    private int valorTotal;
    private int valorEstimado;
    private Date fechaCompletacion;

    public ListaProductos() {

    }

    public ListaProductos(String nombreLista) {
        this.nombreLista = nombreLista;
        this.valorTotal = 0;
        this.valorEstimado = 0;
        this.productos = new ArrayList<Producto>();
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(int valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Date getFechaCompletacion() {
        return fechaCompletacion;
    }

    public void setFechaCompletacion(Date fechaCompletacion) {
        this.fechaCompletacion = fechaCompletacion;
    }
    
    public boolean crearProducto(String nombreProducto, int cantidad){
        return true;
    }
    
    public boolean eliminarProducto(int idProducto){
        return true;
    }
    
    public boolean editarProducto(int idProducto){
        return true;
    }
    
    public boolean buscarProducto(int idProducto){
        return true;
    }
}
