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
public class Nodo {
   String nombre;


    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nodo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
