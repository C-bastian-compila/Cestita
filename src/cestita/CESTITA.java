/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cestita;

import guicestita.MenuInicio;
import package1.ColeccionListas;
import package1.Inventario;

/**
 *
 * @author Sebastian
 */
public class CESTITA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        ColeccionListas listas = new ColeccionListas();
        Inventario inventario = new Inventario();

        MenuInicio inicio = new MenuInicio(inventario, listas);
        inicio.setVisible(true);
    }
    
}
