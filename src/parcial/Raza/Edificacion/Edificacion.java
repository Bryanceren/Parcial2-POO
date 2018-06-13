/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Edificacion;

import parcial.Raza.Milicia.MiliciaFactory;
import parcial.Raza.Recursos;
import parcial.Raza.Vehiculo.VehiculoFactory;

/**
 *
 * @author Kriz
 */
public abstract class Edificacion {
    private String nombre;
    private int vida;
 
    
    public Edificacion(){};
    
    public Edificacion(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public abstract Recursos generar(Recursos recurso);
    public abstract MiliciaFactory crearMilicia();
    public abstract VehiculoFactory crearVehiculo();
    
}
