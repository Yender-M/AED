package aed.lab2;

import java.util.LinkedList;
import javax.swing.JPanel;

public class Arbol {

    private Nodo raiz;
    int alt;

    public Arbol() {
        raiz = null;
    }
    
    public boolean agregar(String dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz, 0);
        return true;
    }
    
    //Metodo para insertar un dato en el arbol...no acepta repetidos :)
    public void insertar(Nodo nuevo, Nodo pivote, int lado) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else { //Falta ponerlo en cuestión de las i que se tratan
            if(this.raiz == null){
                raiz = nuevo;
            }
            else{
                if(nuevo.getDato() != pivote.getDato()){
                    if(pivote.getIzq() == null){
                        pivote.setIzq(nuevo);
                    }
                    else{
                        insertar(nuevo, pivote.getIzq(), 1);
                    }
                }
                else{
                    if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                    } else {
                        insertar(nuevo, pivote.getDer(), 1);
                    }
                }
            }
        }

    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzq(), recorrido);
            preorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(String dato, int lado) {
        Nodo aux = raiz;
        
        while(aux != null){
            if (dato == aux.getDato()){
                return true;
            }
            else if(lado == 1){
                aux = aux.getDer();
            }
            else if(lado == 2){
                aux = aux.getIzq();
            }
        }
        
        return false;
    }

    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }
    
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
