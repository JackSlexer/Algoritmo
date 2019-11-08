/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebaarbol;

/**
 *
 * @author ccgja
 */
public class aristas {
 public Nodo nodo1;
public Nodo nodo2;
public int precio;

        public aristas() {
    }

    public Nodo getNodo1() {
        return nodo1;
    }

    public void setNodo1(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    public Nodo getNodo2() {
        return nodo2;
    }

    public void setNodo2(Nodo nodo2) {
        this.nodo2 = nodo2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public aristas(Nodo nodo1, Nodo nodo2, int precio) {
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "aristas{" + "nodo1=" + nodo1 + ", nodo2=" + nodo2 + ", precio=" + precio + '}';
    }

}
