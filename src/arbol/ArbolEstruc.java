/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author ccgja
 */
public class ArbolEstruc {
    Nodo raiz;

    public ArbolEstruc() {
        this.raiz = null;
    }
    Nodo Agregar(Nodo raiz, int dato){
        if (raiz == null) {
            raiz= new Nodo(dato);
            return raiz;
        }
        if (dato > raiz.dato) {
            //raiz.izquierdo= Agregar(raiz.izquierdo, dato);
        }else if (dato<raiz.dato) {
            //raiz.derecho= Agregar(raiz.derecho, dato);
        }
    return raiz;
    }
     void Imprimir(Nodo raiz){
     if(raiz != null){
         Imprimir(raiz.izquierdo);
         System.out.println(raiz.dato + " - ");
         Imprimir(raiz.derecho);
     }
     }
     void insertar(int dato){
     raiz=Agregar(raiz, dato);
     }
     void añadir(int array[]){
         for (int i = 0; i < array.length; i++) {
             insertar(array[i]);
         }
     }
     }

