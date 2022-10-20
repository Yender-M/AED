/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed.lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pavel
 */
public class Lab5_EJE_5 {
    List<Integer> lisNum = new ArrayList<Integer>();
    List<Integer> mayor = new ArrayList<Integer>();
    List<Integer> menor = new ArrayList<Integer>();
    
    
    public void mayor_menor(List<Integer> numero, List<Integer> mayor, List<Integer> menor)
    {
        if(numero.get(numero.size()-1)>10)
        {
            mayor.add(numero.get(numero.size()-1));
        }
        else 
        {
            menor.add(numero.get(numero.size()-1));
        }
    }
}
