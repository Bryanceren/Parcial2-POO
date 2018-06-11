/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Milicia.Milicia;
import parcial.Raza.Vehiculo.Vehiculo;

/**
 *
 * @author Kriz
 */
public interface RazaFactory {
    Edificacion getEdificacion(int type);
    Vehiculo getVehiculo(int type);
    Milicia getMilicia(int type);
}
