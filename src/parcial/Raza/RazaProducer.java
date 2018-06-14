/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza;

import parcial.Raza.Edificacion.EdificacionFactory;
import parcial.Raza.Milicia.MiliciaFactory;
import parcial.Raza.Vehiculo.VehiculoFactory;

/**
 *
 * @author Kriz
 */
public class RazaProducer {
    public static RazaFactory getFactory(int type){
        switch (type){
            case 1:
                return  new EdificacionFactory();
            case 2:
                return new VehiculoFactory();
            case 3:
                return new MiliciaFactory();
        }
        return null;
    }
}
