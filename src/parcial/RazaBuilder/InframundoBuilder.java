/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.RazaBuilder;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Recursos;

/**
 *
 * @author Kriz
 */
public class InframundoBuilder extends razaBuilder{
    @Override
    public void buildCentroMando() {
        Recursos recursosiniciales=new Recursos(10000,5000,3000);
        Edificacion centro=raza.getEdificacion(6);
        centro.setNombre("Centro Oscuro");
        centro.setVida(10000);
        centro.generar(recursosiniciales);
    }

    @Override
    public void buildEdificacionRecurso1(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-1000);
        recursos.setRecurso2(recursos.getRecurso2()-1000);
        Edificacion recursos1=raza.getEdificacion(1);
        recursos1.setNombre("agujero");
        recursos1.setVida(2000);
        recursos1.generar(recursos);        
    }
    
    @Override
    public void buildEdificacionRecurso2(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-2000);
        recursos.setRecurso2(recursos.getRecurso2()-1000);
        Edificacion recursos2=raza.getEdificacion(2);
        recursos2.setNombre("casa de brujos");
        recursos2.setVida(3000);
        recursos2.generar(recursos);        
    }
    
    @Override
    public void buildEdificacionRecurso3(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-1500);
        recursos.setRecurso2(recursos.getRecurso2()-1200);
        recursos.setRecurso3(recursos.getRecurso3()-500);
        Edificacion recursos3=raza.getEdificacion(3);
        recursos3.setNombre("pozo de sangre");
        recursos3.setVida(2500);
        recursos3.generar(recursos);        
    }
    @Override
    public void buildEdificacionVehiculo(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-2000);
        recursos.setRecurso2(recursos.getRecurso2()-1500);
        recursos.setRecurso3(recursos.getRecurso3()-600);
        Edificacion vehiculos=raza.getEdificacion(4);
        vehiculos.setNombre("portal");
        vehiculos.setVida(3500);
//        VehiculoFactory vehiculosf=vehiculos.crearVehiculo();
//        System.out.println("tipo de vehiculo? \npress 1 para dragon, press 2 para tigre");
//        vehiculosf.getVehiculo(opc.nextInt());
        
        
    }
    @Override
    public void buildEdificacionMilicia(Recursos recursos) {
        recursos.setRecurso1(recursos.getRecurso1()-3000);
        recursos.setRecurso2(recursos.getRecurso2()-2000);
        recursos.setRecurso3(recursos.getRecurso3()-700);
        Edificacion milicia=raza.getEdificacion(5);
        milicia.setNombre("cementerio");
        milicia.setVida(1000);       
    }
}
