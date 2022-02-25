/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author xpc
 */
public class NodoList {
private Contenedor dato;
private NodoList next;

    public NodoList(Contenedor dato) {
        this.dato = dato;
    }
   public Contenedor getDato() {
        return dato;
    }

    public void setDato(Contenedor dato) {
        this.dato = dato;
    }

    public NodoList getNext() {
        return next;
    }

    public void setNext(NodoList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }


    }

    

