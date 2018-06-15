/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import parcial.RazaBuilder.CreadorRaza;

/**
 *
 * @author Kriz
 */
public class Jugador {
    private String Nombre;
    public CreadorRaza raza;

    public Jugador() {
    }

    public Jugador(String Nombre, CreadorRaza raza) {
        this.Nombre = Nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public CreadorRaza getRaza() {
        return raza;
    }

    public void setRaza(CreadorRaza raza) {
        this.raza = raza;
    }
    
}
