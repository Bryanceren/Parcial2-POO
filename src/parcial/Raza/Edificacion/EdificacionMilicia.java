/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Edificacion;

import parcial.Raza.Milicia.Milicia;
import parcial.Raza.Milicia.MiliciaFactory;
import parcial.Raza.Recursos;
import parcial.Raza.Vehiculo.Vehiculo;
import parcial.Raza.Vehiculo.VehiculoFactory;

/**
 *
 * @author Kriz
 */
public class EdificacionMilicia extends Edificacion{

    @Override
    public Recursos generar(Recursos recursos){
        return null;
    }
    @Override
    public MiliciaFactory crearMilicia() {
        return new MiliciaFactory();
    }

    @Override
    public VehiculoFactory crearVehiculo() {
        return null;
    }
    
}
