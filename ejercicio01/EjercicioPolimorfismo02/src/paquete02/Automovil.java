/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombre;
    protected String placa;
    protected double valorF;
    
    public Automovil(String nom, String pl){
        nombre = nom;
        placa = pl;
    }
    
    public void establecerNombre(String d){
        nombre = d;
    }
    
    public void establecerPlaca(String d){
        placa = d;
    }
    
    public abstract void calcularValorF();
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerPlaca(){
        return placa;
    }
    
    public double obtenerValorF(){
        return valorF;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("DATOS GENERALES\n"
                + "Nombre: %s\n"
                + "Placa: %s\n",
                nombre, placa);
        return cadena;
    }
}
