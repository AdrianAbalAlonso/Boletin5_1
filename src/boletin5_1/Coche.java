/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author Adrián
 */
public class Coche {

    private int velocidad;

    public Coche() {
        velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int valor) {
        velocidad += valor;

    }

    public void frenar(int menos) {
        velocidad -= menos;
    }

}
