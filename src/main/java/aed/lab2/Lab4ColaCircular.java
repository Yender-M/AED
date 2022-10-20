
package aed.lab2;

public class Lab4ColaCircular {
    private Nodo primero;
    private Nodo ultimo;
    
    public Lab4ColaCircular(){
        primero = null;
        ultimo = null;
    }
    
    public boolean colaVacia(){
        return primero == null;
    }
    
    public void insertar(Object dato){
        Nodo nuevoNodo;
        nuevoNodo = new Nodo(dato);
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
        Nodo aux;
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
