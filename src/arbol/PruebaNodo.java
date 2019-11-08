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
public class PruebaNodo {
    public static void main(String[] args) {
       ArbolEstruc arbol= new ArbolEstruc(); 
       int array[]={5,16,4,77,3,1,8,35,11,69,20,78,10,254,98,788};
       arbol.añadir(array);
       arbol.Imprimir(arbol.raiz);
    }
}
