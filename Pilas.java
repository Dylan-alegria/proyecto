/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
public class Pilas  {
    private Nodo inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
        
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
 
    public boolean esVacia(){
        return inicio == null;
    }
 
 
    public int getTamanio(){
        return tamanio;
    }
    

    public void apilar(int valor ){
     
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
 
        if (esVacia()) {
           
            inicio = nuevo;
        }
       
    else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
      
        tamanio++;
    } 
  
   
    public void retirar(){
        if (!esVacia()) {
           
            inicio = inicio.getSiguiente();
        
            tamanio--;
        }
    }
     public void editar(int referencia, int valor){
        
        if (buscar(referencia)) {
         
            Nodo pilaAux = null;
         
            while(referencia != inicio.getValor()){
               
                Nodo temp = new Nodo();
              
                temp.setValor(inicio.getValor());
              
                if(pilaAux == null){
                
                    pilaAux = temp;
                }
               
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
           
                retirar();
            }
            
            inicio.setValor(valor);
            
            while(pilaAux != null){
           
                apilar(pilaAux.getValor());
               
                pilaAux = pilaAux.getSiguiente();
            }
           
            pilaAux = null;
        }
    }
    
  
    public boolean buscar(int referencia){
   
        Nodo aux = inicio;
      
        boolean existe = false;
       
     
        while(existe != true && aux != null){
    
            if (referencia == aux.getValor()) {
             
                existe = true;
            }
            else{
             
                aux = aux.getSiguiente();
            }
        }
    
        return existe;
    }

    public void listar(){
       
        Nodo aux = inicio;
        
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            System.out.println("                   ");
            
            
            aux = aux.getSiguiente();
        }
    }
     public void contador(){
        if (!esVacia()) {
           
            inicio = inicio.getSiguiente();
        
            tamanio++;
            System.out.println(tamanio);
        }
    }
}
    

