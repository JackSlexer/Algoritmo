/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ccgja
 */
public class mainarbol {
    public static void main(String[] args) {
        
    
    arbolavl arbol = new arbolavl();
        Nodo nodo;
        int numero;
        int opcion = 0;
        Scanner t = new Scanner(System.in);

        do {
            try {
                System.out.println("\nMENU "
                        + "\n 1.- Agregar"
                        + "\n 2.- Terminar");
                opcion = t.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese numero");
                        numero = t.nextInt();
                        if (numero >= 0) {
                            arbol.insertar(numero);
                            System.out.println("Agregado");
                            arbol.imprimirPre();
                            
                        }
                        break;
                    case 2:
                        System.out.println("Ingresar numero a eliminar");
                        numero = t.nextInt();
                        arbol.eliminar(numero);
                         arbol.imprimirPre();
                        break;
                    default:
                        System.out.println("Opcion no existe");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Dato incorrecto, solo numero porfavor");
                opcion = 2;
            }
        } while (opcion != 3);
}
}


