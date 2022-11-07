/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed.lab2;

import java.awt.Graphics;

public class Lab6Graficar {
    
    
    public static void Nodo(Graphics g, String dato, int x, int y, int x1, int y1){
        g.drawString(dato, x + 4, y + 11);
        g.drawOval(x, y, 15, 15);
        g.drawLine(x + 6, y, x1 + 7, y1 + 15);
    }
    
    public static void Linea(Graphics g, int x1, int y1, int x2, int y2){
        
    }
}
