
package aed.lab2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lab4PiLa {
    
    public Lab4PiLa(){
        
    }
    
    int tam = 19;
    int tope=-1;
    String pila[] = new String [tam];
    public String push(String cadena)
    {
        if(tope == tam-1)
        {
            JOptionPane.showMessageDialog(null, "Pila llena");
        }
        else
        {
            tope = tope+1;
            pila[tope]= cadena;
            //JOptionPane.showMessageDialog(null, tope+pila[tope]); 
        }
        return cadena;
    }
    
    
    public String pop()
    {
        String quitar = "";
        if(tope == -1)
        {
            JOptionPane.showMessageDialog(null, "No hay elementos en la pila");
        }
        else
        {
            quitar = pila[tope];
            tope = tope-1;
            
        }
        return quitar;
    }
    
 
}
