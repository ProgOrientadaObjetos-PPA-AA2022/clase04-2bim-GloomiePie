/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {
    
    double galonesMax;
    double costoGalon;
    double iva;
    
    public AutomovilGasolina(double galones, double costo){
        galonesMax = galones;
        costoGalon = costo;
    }
    
    public void establecerGalonesMax(double d){
        galonesMax = d;
    }
    
    public void establecerCostoGalon(double d){
        costoGalon = d;
    }
    
    public void establecerIva(){
        iva = 0.1;
    }
    
    @Override
    public void calcularValorF(){
        valorF = (costoGalon * galonesMax) + iva * 
                ((costoGalon * galonesMax)) ;
    }
    
    public double obtenerGalonesMax(){
        return galonesMax;
    }
    
    public double obtenerCostoGalon(){
        return costoGalon;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Vehículo a gasolina\n"
                + "Números de galones máximos: %.2f\n"
                + "Costo de cada galón: %.2f\n"
                + "IVA: %.2f\n"
                + "Valor final a pagar: %.2f\n",
        galonesMax, costoGalon, iva, obtenerValorF());
        return cadena;
    }
 
}
