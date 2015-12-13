/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        JOptionPane.showMessageDialog(null, " Ahora mismo va a " + coche1.getVelocidad() );
        String respuesta = JOptionPane.showInputDialog(" ¿Cuento quieres acelerar? ");
        coche1.acelerar(Integer.parseInt(respuesta));
        JOptionPane.showMessageDialog(null, "Velocidad a aumentar " + coche1.getVelocidad() + " km/h");
        String respuesta2 = JOptionPane.showInputDialog("¿Cuanto quieres reducir?");
        coche1.frenar(Integer.parseInt(respuesta2));
        JOptionPane.showMessageDialog(null, "Esta sera su velocidad cuando frena " + coche1.getVelocidad() );
    }
}


