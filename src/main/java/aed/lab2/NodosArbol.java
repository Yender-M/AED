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
    
    Nodo raiz;
    
    public NodosArbol(){
        raiz = null;
    }
    
    public void insertar(int i, boolean derecha, boolean izquierda){
        Nodo n = new Nodo(i);
        
        if(raiz == null){
            raiz = n;
        }
        else{
            //Tiene que poner algo aquí relacionado al número que le corresponde
            if(derecha == true){
                //Quizás algo como nodo.derecha = n;
            }
            else if(izquierda == false){
                //nodo.izquierda = n; //o algo así
            }
            else{
            }
        }
    }
    
    private class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        
        public Nodo(int indice){
            llave = indice;
            padre = null;
            derecha = null;
            izquierda = null;
        }
    }
}
