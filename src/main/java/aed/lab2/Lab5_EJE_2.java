package aed.lab2;

import java.util.*;

public class Lab5_EJE_2 {
    List<Integer> lisNum = new ArrayList<Integer>();
    List<Integer> positivo = new ArrayList<Integer>();
    List<Integer> negativo = new ArrayList<Integer>();
    
    
    public void positivo_negativo(List<Integer> numero, List<Integer> positivo, List<Integer> negativo)
    {
        if(numero.get(numero.size()-1)>=0)
        {
            positivo.add(numero.get(numero.size()-1));
        }
        else 
        {
            negativo.add(numero.get(numero.size()-1));
        }
    }
}
