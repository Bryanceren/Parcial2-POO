/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.RazaBuilder;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.RazaFactory;
import parcial.Raza.Recursos;

/**
 *
 * @author Kriz
 */
public class CreadorRaza {
    public razaBuilder razaBuilder;
    
    public Edificacion construirCentroMando(){
        return razaBuilder.buildCentroMando();
    } 
    
    public Edificacion construirEdificacionRecurso1(Recursos recursos){
        return razaBuilder.buildEdificacionRecurso1(recursos);
    } 
    
    public Edificacion construirEdificacionRecurso2(Recursos recursos){
        return razaBuilder.buildEdificacionRecurso2(recursos);
    } 
    
    public Edificacion construirEdificacionRecurso3(Recursos recursos){
        return razaBuilder.buildEdificacionRecurso3(recursos);
    } 
    
    public Edificacion construirEdificacionMilicia(Recursos recursos){
       return razaBuilder.buildEdificacionMilicia(recursos);
    } 
    
    public Edificacion construirEdificacionVehiculo(Recursos recursos){
        return razaBuilder.buildEdificacionVehiculo(recursos);
    } 
    
    public void setRazaBuilder(razaBuilder rb){
        razaBuilder=rb;
    }
    public RazaFactory getRaza(){
        return razaBuilder.getRaza();
    }
}
