/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Edificacion;

import parcial.Raza.Milicia.Milicia;
import parcial.Raza.RazaFactory;
import parcial.Raza.Vehiculo.Vehiculo;

/**
 *
 * @author Kriz
 */
public class EdificacionFactory implements RazaFactory{
    @Override
    public Edificacion getEdificacion(int type) {
        switch (type) {
            case 1:
                return new EdificacionRecurso1();
            case 2:
                return new EdificacionRecurso2();
            case 3:
                return new EdificacionRecurso3();
            case 4:
                return new EdificacionVehiculo(); 
            case 6:
                return new EdificacionMilicia();
        }
        return null;
}

    @Override
    public Vehiculo getVehiculo(int type) {
        return null;
    }

    @Override
    public Milicia getMilicia(int type) {
        return null;
    }
    
}
