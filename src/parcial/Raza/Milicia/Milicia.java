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
public abstract class Milicia {
    private String nombre;
    private int vida;
    private int ataque;
    
    Milicia(){};

    public Milicia(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
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

    public int getAtaque() {
        return ataque;
    }

    public abstract Edificacion AtaqueEdificacion(Edificacion edificacion);
    public abstract Milicia AtaqueMilicia(Milicia milicia);
    public abstract Vehiculo AtaqueVehiculo(Vehiculo vehiculo);
    
}
