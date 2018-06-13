/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Vehiculo;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Milicia.Milicia;
import parcial.Raza.RazaFactory;

/**
 *
 * @author Kriz
 */
public class VehiculoFactory implements RazaFactory{
    @Override
    public Edificacion getEdificacion(int type) {
        return null;
}

    @Override
    public Vehiculo getVehiculo(int type) {
        switch (type) {
            case 1:
                return new VehiculoTipo1();
            case 2:
                return new VehiculoTipo2();
           
        }
        return null;
    }
    
    @Override
    public Milicia getMilicia(int type) {
        return null;
    }
    
}
