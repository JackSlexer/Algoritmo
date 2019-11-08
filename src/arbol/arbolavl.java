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
public class arbolavl {
   private Nodo raiz;

    public arbolavl() {
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    private Nodo insertarDato(Nodo nuevoNodo, Nodo nodo) {
       Nodo nuevoPadre = nodo;

        if (nuevoNodo.dato < nodo.dato) {
            if (nodo.izq == null) {
                nodo.izq = nuevoNodo;
            } else {
                nodo.izq = insertarDato(nuevoNodo, nodo.izq);
                if ((obtenerAltura(nodo.izq) - obtenerAltura(nodo.der) == 2)) {
                    if (nuevoNodo.dato < nodo.izq.dato) {
                        nuevoPadre = rotacionIzq(nodo);
                    } else {
                       
                    }
                }
            }
        } else if (nuevoNodo.dato > nodo.dato) {
            if (nodo.der == null) {
                nodo.der = nuevoNodo;
            } else {
                nodo.der = insertarDato(nuevoNodo, nodo.der);
                if ((obtenerAltura(nodo.der) - obtenerAltura(nodo.izq) == 2)) {
                    if (nuevoNodo.dato > nodo.der.dato) {
                        nuevoPadre = rotacionDer(nodo);
                    } else {
                       
                    }
                }
            }
        } else {
            System.out.println("Duplicado");
        }
        if ((nodo.izq == null) && (nodo.der != null)) {
            nodo.altura = nodo.der.altura + 1;
        } else if ((nodo.der == null) && (nodo.izq != null)) {
            nodo.altura = nodo.izq.altura + 1;
        } else {
            nodo.altura = Math.max(obtenerAltura(nodo.izq), obtenerAltura(nodo.der)) + 1;
        }
        return nuevoPadre;
    }

  
    public void insertar(int dato) {
        Nodo nodo = new Nodo(dato);
        
        if (raiz == null) {
            raiz = nodo;
            
        } else {
            raiz = insertarDato(nodo, raiz);
        }
    }

    private void imprimirPre(Nodo reco) {
        if (reco != null) {
            System.out.print(reco + " ");
            imprimirPre(reco.izq);
            imprimirPre(reco.der);
        }
    }
    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }
    public int obtenerAltura() {
        return obtenerAltura(raiz);
    }
    private int obtenerAltura(Nodo nodo) {
        if (nodo == null) {
            return -1;
        } else {
            return nodo.altura;
        }
    }
    public Nodo rotacionIzq(Nodo nodo) {
        Nodo aux = nodo.izq;
        nodo.izq = aux.der;
        aux.der = nodo;
        nodo.altura = Math.max(obtenerAltura(nodo.izq), obtenerAltura(nodo.der)) + 1;
        aux.altura = Math.max(obtenerAltura(aux.izq), obtenerAltura(aux.der)) + 1;
        return aux;
    }
    public Nodo rotacionDer(Nodo nodo) {
        Nodo aux = nodo.der;
        nodo.der = aux.izq;
        aux.izq = nodo;
        nodo.altura = Math.max(obtenerAltura(nodo.izq), obtenerAltura(nodo.der)) + 1;
        aux.altura = Math.max(obtenerAltura(aux.izq), obtenerAltura(aux.der)) + 1;
        return aux;
    }
    private boolean soloRaiz(Nodo nodo) {
        if (nodo.getDer() == null && nodo.getIzq() == null) {
            nodo = null;
            return true;
        }
        return false;
    }

    
    public Nodo eliminar(int dato) {
        return EliminarNodo(raiz, dato);
    }

    private Nodo EliminarNodo(Nodo nodo, int dato) {
        if (soloRaiz(nodo)) {
            return null;
        }
        if (nodo == null) {
        } else if (dato < nodo.getDato()) {
            Nodo izq;
         
            izq = EliminarNodo(nodo.getIzq(), dato);
         
            nodo.setIzq(izq);
        } else if (dato > nodo.getDato()) {
            Nodo der;
            der = EliminarNodo(nodo.getDer(), dato);
            nodo.setDer(der);
        } else {
            Nodo eliminar;
            eliminar = nodo;
            if (eliminar.getIzq() == null) {
                nodo = eliminar.getDer();
            } else if (eliminar.getDer() == null) {
                nodo = eliminar.getIzq();
            } else {
                eliminar = reemplazar(eliminar);
            }
        }
        return nodo;
    }

    private Nodo reemplazar(Nodo nodo) {
        Nodo N1, N2;
        N2 = nodo;
        N1 = nodo.getIzq();

        while (N1.getDer() != null) {
            N2 = N1;
            N1 = N1.getDer();
        }

        nodo.setDato(N1.getDato());

        if (N2 == nodo) {
            N2.setIzq(N1.getIzq());
        } else {
            N2.setDer(N1.getIzq());
        }

        return N1;
    }

    @Override
    public String toString() {
        return raiz + " ";
    }
}  

