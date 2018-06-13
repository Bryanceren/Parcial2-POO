/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Milicia;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.RazaFactory;
import parcial.Raza.Vehiculo.Vehiculo;

/**
 *
 * @author Kriz
 */
public class MiliciaFactory implements RazaFactory{
    @Override
    public Edificacion getEdificacion(int type) {
        return null;
}

    @Override
    public Vehiculo getVehiculo(int type) {
        return null;
    }

    @Override
    public Milicia getMilicia(int type) {
        switch (type) {
            case 1:
                return new Escuadron();
            case 2:
                return new Especialista();
           
        }
        return null;
    }
    
}
