/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;


public class Taller {
  int numC;
String Codicion,tipo;

    public Taller(int numC, String Codicion, String tipo) {
        this.numC = numC;
        this.Codicion = Codicion;
        this.tipo = tipo;
    }

    

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public String getCodicion() {
        return Codicion;
    }

    public void setCodicion(String Codicion) {
        this.Codicion = Codicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n Taller{" + "numero de Contenedor=" + numC + ", Codicion=" + Codicion + ", tipo=" + tipo + '}';
    }


}
