/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Edificacion;

import parcial.Raza.Milicia.MiliciaFactory;
import parcial.Raza.Recursos;
import parcial.Raza.Vehiculo.Vehiculo;
import parcial.Raza.Vehiculo.VehiculoFactory;

/**
 *
 * @author Kriz
 */
public class EdificacionRecurso3 extends Edificacion{
    @Override
    public Recursos generar(Recursos recursos){
        recursos.recurso3+=1000;
        return recursos;
    }
    @Override
    public MiliciaFactory crearMilicia() {
        return null;
    }

    @Override
    public VehiculoFactory crearVehiculo() {
        return null;
    }
}
