/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed.lab2;

/**
 *
 * @author pavel
 */
public class NodosArbol {
    Object dato;
    Nodo izq;
    Nodo der;
    
    public NodosArbol(Object dato, Nodo izq, Nodo der){
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }
    
    public Object getDato(){
        return dato;
    }
    
    public void setDato(Object dato){
        this.dato = dato;
    }
    
    public Object getIzq(){
        return izq;
    }
    
    public void setIzqu(Nodo izqu){
        this.izq = izq;
    }
    
    public Object getDer(){
        return der;
    }
    
    public void setDer(Nodo der){
        this.der = der;
    }
}
