/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;


/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private ArrayList<Transporte> transportes;

    public TiposTransporte() {
        this.promedioTarifas = 0;
        this.transportes = new ArrayList<>();
    }

    public void establecerTransportes(ArrayList<Transporte> t){
        transportes = t;
    }
    
    public ArrayList<Transporte> obtenerTransportes(){
        return transportes;
    }
    
    public void establecerPromedioTarifas(){
        for (Transporte transporte : transportes){
            promedioTarifas += transporte.obtenerTarifa();
        }
        promedioTarifas /= transportes.size();
    }

    public void addTransporte(Transporte e){
        this.transportes.add(e);
        establecerPromedioTarifas();
    }

    public void addTransportes(ArrayList<Transporte> e){
        this.transportes.addAll(e);
        establecerPromedioTarifas();
    }

    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
}
