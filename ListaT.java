/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import proyecto.Taller;
import proyecto.NodoT;
import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class ListaT {

    private NodoT cabeza;
private int tamanio;

    public NodoT getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoT cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void insertar(Taller a) {
        if (cabeza == null) {
            cabeza = new NodoT(a);

        } else {
            if (a.getNumC()< cabeza.getDato().getNumC()) {
                NodoT aux = new NodoT (a);
                aux.setNext(cabeza);
                cabeza = aux;
            } else {
                if (cabeza.getNext() == null) {
                    cabeza.setNext(new NodoT(a));
                } else {
                    NodoT aux = cabeza;
                    while (aux.getNext() != null
                            && a.getNumC()> aux.getNext().getDato().getNumC()) {
                        aux = aux.getNext();
                    }
                    NodoT temp = new NodoT(a);
                    temp.setNext((aux.getNext()));
                    aux.setNext(temp);
                }
            }

        }
    }
    
    @Override
    public String toString() {
        NodoT aux = cabeza;
        String msj = "";

        int i = 0;

        while (aux != null) {

            System.out.print(aux.getDato());

            aux = aux.getNext();

        }
        return msj;

    }
     public void listar(){
        // Verifica si la lista contiene elementoa.
       NodoT aux=cabeza;
        if (aux !=null) {
        
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.getDato()+ " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getNext();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }


       public boolean buscar(int referencia){
        // Crea una copia de la lista.
        NodoT aux = cabeza;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getDato().getNumC()){
                // Canbia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getNext();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
 public void removerPorReferencia(int referencia){
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (cabeza.getDato().getNumC()== referencia) {
                // El primer nodo apunta al siguiente.
                cabeza = cabeza.getNext();
            } else{
                // Crea ua copia de la lista.
                NodoT aux = cabeza;
                // Recorre la lista hasta llegar al nodo anterior 
                // al de referencia.
                while(aux.getNext().getDato().getNumC()!= referencia){
                    aux = aux.getNext();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                NodoT siguiente = aux.getNext().getNext();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setNext(siguiente);  
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }



    public void agregar(int numCont, String tipo, String desc) {//metodo con los parametros necesarios para poder agregar al estudiante

        NodoT aux = cabeza;
        int i = 0; //contador para hacer la lista mas grande
        while (aux != null) {//lee la lista
            if (numCont!= (aux.getDato().getNumC())) {//como todo el id es diferente , aqui el pograma registra si el estudiante esta registrado 
                //si el id es diferente  se imprime los datos o si es igual no deja agregar al nuevo estudianete 
                System.out.print(aux.getDato());

            } else {

                JOptionPane.showMessageDialog(null, "este numero de contenedor esta registrado");
            }

            aux = aux.getNext();
            i++;

        }
    }

}
       
