/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Milicia;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Vehiculo.Vehiculo;

/**
 *
 * @author Kriz
 */
public class Escuadron extends Milicia{
    @Override
    public Edificacion AtaqueEdificacion(Edificacion edificacion){
        edificacion.setVida(edificacion.getVida()-Escuadron.this.getAtaque());        
        return edificacion;
    };
    
    @Override
    public Milicia AtaqueMilicia(Milicia milicia){
        milicia.setVida(milicia.getVida()-Escuadron.this.getAtaque());
        return milicia;
    };
    
    @Override
    public Vehiculo AtaqueVehiculo(Vehiculo vehiculo){
        vehiculo.setVida(vehiculo.getVida()-Escuadron.this.getAtaque());
        return vehiculo;
    };
}
