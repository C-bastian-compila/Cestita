package package1;

import java.util.*;

public class Producto {
    
    private String nombreProducto;
    private String marca;
    private String superMercado;
    private int valor;
    private int idProducto;
    private Date fechaAgregacion;
    private int cantidadLista;
    private int cantidadPosecion;
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSuperMercado() {
        return superMercado;
    }

    public void setSuperMercado(String superMercado) {
        this.superMercado = superMercado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Date getFechaAgregacion() {
        return fechaAgregacion;
    }

    public void setFechaAgregacion(Date fechaAgregacion) {
        this.fechaAgregacion = fechaAgregacion;
    }

    public int getCantidadLista() {
        return cantidadLista;
    }

    public void setCantidadLista(int cantidadLista) {
        this.cantidadLista = cantidadLista;
    }

    public int getCantidadPosecion() {
        return cantidadPosecion;
    }

    public void setCantidadPosecion(int cantidadPosecion) {
        this.cantidadPosecion = cantidadPosecion;
    }
    
    
}
