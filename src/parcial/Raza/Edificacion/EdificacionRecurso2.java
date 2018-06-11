/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Edificacion;

import parcial.Raza.Recursos;


/**
 *
 * @author Kriz
 */
public class EdificacionRecurso2 extends Edificacion{
    @Override
    public Recursos generar(Recursos recursos){
        recursos.recurso2+=1000;
        return recursos;
    }
}
