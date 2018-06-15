/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.Raza.Vehiculo;

import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Milicia.Especialista;
import parcial.Raza.Milicia.Milicia;

/**
 *
 * @author Kriz
 */
public abstract class Vehiculo {
    private String nombre;
    private int vida;
    private int ataque;
    
    Vehiculo(){};

    public Vehiculo(String nombre, int vida, int ataque) {
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
    public void setAtaque(int ataque){
        this.ataque=ataque;
    }
    public abstract Edificacion AtaqueEdificacion(Edificacion edificacion);
    public abstract Milicia AtaqueMilicia(Milicia milicia);
    public abstract Vehiculo AtaqueVehiculo(Vehiculo vehiculo);
//    Edificacion AtaqueEdificacion(Edificacion edificacion){
//        return edificacion;
//    };
    

    /*    
    Milicia AtaqueMilicia(Milicia milicia){
        return milicia;
    };
//    Especialista AtaqueEspecialista(Especialista especialista){
//        return especialista;
//    };
    Vehiculo AtaqueVehiculo(Vehiculo vehiculo){
        return vehiculo;
    };*/
}
