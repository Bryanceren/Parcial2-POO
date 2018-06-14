/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.RazaFactory;
import parcial.Raza.RazaProducer;
import parcial.Raza.Recursos;

/**
 *
 * @author Kriz
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RazaFactory raza1;
        raza1=RazaProducer.getFactory(1);
        Edificacion CentroMando;
        CentroMando=raza1.getEdificacion(1);
        CentroMando.setNombre("CentroOscuro");
        CentroMando.setVida(20000);
        
        Recursos recursosiniciales=new Recursos(10000,5000,100);
        
        CentroMando.generar(recursosiniciales);
    }
    
}
