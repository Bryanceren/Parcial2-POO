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
public class EdificacionRecurso2 extends Edificacion {

    @Override
    public Recursos generar(Recursos recursos) {
        System.out.println("se annadio 1000 de recurso 2");
        recursos.recurso2 += 1000;
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
