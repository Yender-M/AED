/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed.lab2;

import java.util.Stack;
import javax.swing.*;

/**
 *
 * @author pavel
 */
public class Lab3Conversion {
    static void convertir(String infija, JTextField mostrarPre, JTextField mostrarPos){
        //Se convierte el StringBuilder de la clase a String para que se muestre     
        mostrarPre.setText(infijaAPrefija(infija));
        mostrarPos.setText(infijaAPostfija(infija));
    }
    
    static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    static String infijaAPrefija(String expression){
       StringBuilder result = new StringBuilder();
       StringBuilder input = new StringBuilder(expression);
       input.reverse();
       Stack<Character> stack = new Stack<>();

       char [] charsExp = new String(input).toCharArray();
       for (int i = 0; i < charsExp.length; i++) {

            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            }
            else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i <charsExp.length ; i++) {
            char c = charsExp[i];
            
            //Si "c" es operando = 0
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>precedence(c)){
                    //Mientras la pila tenga datos y la precendencia de la pila sea mayor 
                    //a la precendencia del caracter se colocan los datos de la pila en el resultado
                    Character dato = stack.pop();
                    result.append(dato);
                }
                
                //Si la pila esta vacía o el operando de la pila es de menor presedencia que 
                //el operando del caracter, se agrega el operando a la pila
                stack.push(c);
            }else if(c == ')'){
                char x = stack.pop();
                
                while(x != '('){
                    result.append(x);
                    x = stack.pop();
                }
            }
            else if(c=='('){
                stack.push(c);
            }
            else{
                //El caracater no es operando ni "("
                result.append(c);
            }
        }
        
        for (int i = 0; i <= stack.size() ; i++) {
            Character dato = stack.pop();
            result.append(dato);     
        }
        return result.reverse().toString();
    }

    static String infijaAPostfija(String expression){
        String result = "";
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //Si "c" es operador = 0
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                    //mientras la pila tenga datos, y 
                    //la precendencia de de la pila sea mayor 
                    //o igual a la precendencia del caracter
                    //se colocan los datos de la pila en el resultado
                }
                //Si la pila esta vacia o el operadoR de la pila es de menor presedencia que 
                // el operadoR de del caracter se agrega el operadoR a la pila
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //el caracter no es operado ni (
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        return result;
    }
}
