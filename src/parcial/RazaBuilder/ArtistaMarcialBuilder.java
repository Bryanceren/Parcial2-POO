/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.RazaBuilder;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.RazaProducer;
import parcial.Raza.Recursos;

/**
 *
 * @author Kriz
 */
public class ArtistaMarcialBuilder extends razaBuilder{

    @Override
    public Edificacion buildCentroMando() {
        raza=RazaProducer.getFactory(1);
        Edificacion centro=raza.getEdificacion(6);
        centro.setNombre("Templo");
        centro.setVida(10000);
        
        return centro;
    }

    @Override
    public Edificacion buildEdificacionRecurso1(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-500);
        recursos.setRecurso2(recursos.getRecurso2()-600);
        raza=RazaProducer.getFactory(1);
        Edificacion recursos1=raza.getEdificacion(1);
        recursos1.setNombre("granja");
        recursos1.setVida(2000);
        recursos1.generar(recursos);    
        return recursos1;
    }
    
    @Override
    public Edificacion buildEdificacionRecurso2(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-1000);
        recursos.setRecurso2(recursos.getRecurso2()-700);
        raza=RazaProducer.getFactory(1);
        Edificacion recursos2=raza.getEdificacion(2);
        recursos2.setNombre("gym");
        recursos2.setVida(3000);
        recursos2.generar(recursos);
        return recursos2;
    }
    
    @Override
    public Edificacion buildEdificacionRecurso3(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-1000);
        recursos.setRecurso2(recursos.getRecurso2()-800);
        recursos.setRecurso3(recursos.getRecurso3()-200);
        raza=RazaProducer.getFactory(1);
        Edificacion recursos3=raza.getEdificacion(3);
        recursos3.setNombre("Herreria");
        recursos3.setVida(2500);
        recursos3.generar(recursos);
        return recursos3;        
    }
    @Override
    public Edificacion buildEdificacionVehiculo(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-1500);
        recursos.setRecurso2(recursos.getRecurso2()-1000);
        recursos.setRecurso3(recursos.getRecurso3()-250);
        raza=RazaProducer.getFactory(1);
        Edificacion vehiculos=raza.getEdificacion(4);
        vehiculos.setNombre("Nido");
        vehiculos.setVida(3500);
        return vehiculos;
//        VehiculoFactory vehiculosf=vehiculos.crearVehiculo();
//        System.out.println("tipo de vehiculo? \npress 1 para dragon, press 2 para tigre");
//        vehiculosf.getVehiculo(opc.nextInt());
        
        
    }
    @Override
    public Edificacion buildEdificacionMilicia(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-2000);
        recursos.setRecurso2(recursos.getRecurso2()-1600);
        recursos.setRecurso3(recursos.getRecurso3()-300);
        raza=RazaProducer.getFactory(1);
        Edificacion milicia=raza.getEdificacion(5);
        milicia.setNombre("Cabañas");
        milicia.setVida(1000); 
        return milicia;
    }
    
    
    
}
