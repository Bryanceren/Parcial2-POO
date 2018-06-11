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
public class Edificacion {
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
    
    Recursos generar(Recursos recurso){
        return recurso;
    };
    
}
