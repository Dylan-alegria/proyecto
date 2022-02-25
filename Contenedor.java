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
public class Contenedor {
           int numCont ;//numero de contenedor
        String tipo ,desc , impor,fech,donde ;////tipo de contenedor //descricion //donde viene//fecha //donde se encuenta 

    public Contenedor(int numCont, String tipo, String desc, String impor,String fech ,String donde ) {
        this.numCont = numCont;
        this.tipo = tipo;
        this.desc = desc;
        this.impor = impor;
        this.fech=fech;
        this.donde= donde;
    }

    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImpor() {
        return impor;
    }

    public void setImpor(String impor) {
        this.impor = impor;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    @Override
    public String toString() {
        return "\nContenedor{" + "numero Cont=" + numCont + ", tipo=" + tipo + ", descripcion=" + desc + ", importado=" + impor + ", fecha=" + fech + ", se encuentra en=" + donde + '}';
    }

  
    }


    


    
    
    

