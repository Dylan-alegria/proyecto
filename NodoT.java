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
public class NodoT {
   private Taller dato;
  private  NodoT next;

    public NodoT(Taller dato) {
        this.dato = dato;
       
    }

    public Taller getDato() {
        return dato;
    }

    public void setDato(Taller dato) {
        this.dato = dato;
    }

    public NodoT getNext() {
        return next;
    }

    public void setNext(NodoT next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodoT" + "dato=" + dato ;
    }

 
    }
    
    

