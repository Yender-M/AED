package aed.lab2;

public class Nodo {
    Object dato;
    Nodo izq;
    Nodo der;
    
    public Nodo(Object dato, Nodo izq, Nodo der){
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
    
    public void setIzq(Nodo izq){
        this.izq = izq;
    }
    
    public Object getDer(){
        return der;
    }
    
    public void setDer(Nodo der){
        this.der = der;
    }
}
