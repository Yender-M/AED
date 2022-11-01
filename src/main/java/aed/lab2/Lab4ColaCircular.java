
package aed.lab2;

public class Lab4ColaCircular {
    private NodoLab4 primero;
    private NodoLab4 ultimo;
    
    public Lab4ColaCircular(){
        primero = null;
        ultimo = null;
    }
    
    public boolean colaVacia(){
        return primero == null;
    }
    
    public void insertar(Object dato){
        NodoLab4 nuevoNodo;
        nuevoNodo = new NodoLab4(dato);
        nuevoNodo.siguiente = nuevoNodo;
        
        if(colaVacia()){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        }
        else{
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = primero;
            ultimo = nuevoNodo;
        }
    }
    
    public Object quitar(){
        Object dato;
        dato = null;
        
        if(!colaVacia()){
            dato = primero.dato;
            
            if(primero == ultimo){
                primero = null;
                ultimo = null;
            }
            else{
                primero = primero.siguiente;
                ultimo.siguiente = primero;
            }
        }
        
        return dato;
    }
    
    public String toString(){
        NodoLab4 aux;
        aux = primero;
        String cad = "";
        
        if(!colaVacia()){
            do{
                cad= cad+aux.dato.toString()+"\n";
                aux = aux.siguiente;
            }while(aux != primero);
        }
        
        return cad;
    }
}
