package package1;

import java.io.*;
import java.util.*;

public class Usuario {
    
    private int idUsuario;
    private String nombreCompleto;
    private String nombreUsuario;
    private String claveCifrada;
    private String correo;
    
    public Usuario(String idUsuario, String nombreCompleto, String nombreUsuario, String claveCifrada, String correo){
        this.idUsuario = Integer.parseInt(idUsuario);
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.claveCifrada = claveCifrada;
        this.correo = correo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveCifrada() {
        return claveCifrada;
    }

    public void setClaveCifrada(String claveCifrada) {
        this.claveCifrada = claveCifrada;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean cambiarNombre(String nuevoNombre){
        return true;
    }
    
    public boolean eliminarCuenta(){
        return true;
    }
    
    public boolean cambiarClave(String nuevaClave){
        return true;
    }
}
