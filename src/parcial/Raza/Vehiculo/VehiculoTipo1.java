/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Vehiculo;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Milicia.Milicia;

/**
 *
 * @author Kriz
 */
public class VehiculoTipo1 extends Vehiculo{
    @Override
    public Edificacion AtaqueEdificacion(Edificacion edificacion){
        edificacion.setVida(edificacion.getVida()-VehiculoTipo1.this.getAtaque());        
        return edificacion;
    };
    
    @Override
    public Milicia AtaqueMilicia(Milicia milicia){
        milicia.setVida(milicia.getVida()-VehiculoTipo1.this.getAtaque());
        return milicia;
    };
    
    @Override
    public Vehiculo AtaqueVehiculo(Vehiculo vehiculo){
        vehiculo.setVida(vehiculo.getVida()-VehiculoTipo1.this.getAtaque());
        return vehiculo;
    };
}
