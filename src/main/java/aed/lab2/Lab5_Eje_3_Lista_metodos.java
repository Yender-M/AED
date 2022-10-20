package aed.lab2;

import java.util.*;

public class Lab5_Eje_3_Lista_metodos extends Lab5_Eje_3_Lista{
    
    public void insertar(String nom, String nEmpl, float salario)
    {
        this.nom.add(nom);
        this.nEmple.add(nEmpl);
        this.Salario.add(salario);
    }
    
    public void calNomina(List<Float> salario)
    {
        nomina += salario.get((Salario.size()-1));
    }
    
   /* public String imprimirNom()
    {
        String nombre = this.nom.set( nom.size()-1,(nom.size()-1));
        return nombre;
    }
    public String imprimirNEple()
    {
        String numEmpleado = this.nEmple.set(nEmple.size()-1,(nEmple.size()-1));
        return numEmpleado;
    }
    public float imprimirSala()
    {
        float sala = this.Salario.set(Salario.size()-1,(Salario.size()-1));
        return sala;
    }*/
}
