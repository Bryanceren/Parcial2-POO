/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.RazaBuilder;

import parcial.Raza.RazaFactory;
import parcial.Raza.RazaProducer;
import parcial.Raza.Recursos;

/**
 *
 * @author Kriz
 */
public abstract class razaBuilder{
    protected RazaFactory raza;
    
   
    public RazaFactory getRaza(){
        return raza;
    }
    public void crearRaza(){
        raza=RazaProducer.getFactory(1);
    }
    public abstract void buildCentroMando();
    public abstract void buildEdificacionRecurso1(Recursos recursos);
    public abstract void buildEdificacionRecurso2(Recursos recursos);
    public abstract void buildEdificacionRecurso3(Recursos recursos);
    public abstract void buildEdificacionVehiculo(Recursos recursos);
    public abstract void buildEdificacionMilicia(Recursos recursos);
    
}
