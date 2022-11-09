/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed.lab2;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.Graphics;

public class Lab6Graficar {
    
    
    public static void Nodo(Graphics g, String dato, int x, int y, int x1, int y1){
        g.drawLine(x + 6, y, x1 + 7, y1 + 15);
       
        g.setColor(Color.pink);
        g.fillOval(x, y, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 20, 20);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("ARIAL", PLAIN, 18));
        g.drawString(dato, x + 5, y + 16);
        
        
        
    }
    
    public static void Linea(Graphics g, int x1, int y1, int x2, int y2){
        
    }
}
