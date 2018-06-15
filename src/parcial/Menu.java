/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;
import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.RazaFactory;
import parcial.Raza.Recursos;
import parcial.RazaBuilder.ArtistaMarcialBuilder;
import parcial.RazaBuilder.CreadorRaza;

/**
 *
 * @author Kriz
 */
public class Menu {

    private static Menu instance;

    private Menu() {

    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    
    public void mostrarRecursos(Recursos recursos){
        System.out.println("Recursos : ");
        System.out.println("Recurso1: "+recursos.getRecurso1());
        System.out.println("Recurso2: "+recursos.getRecurso2());
        System.out.println("Recurso3: "+recursos.getRecurso3());
    }
    
    public void Inicio() {
        String Jugador1, Jugador2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a Bryan's World!!");
        System.out.println("Ingrese su nombre jugardor1: ");
        Jugador1 = leer.nextLine();
        System.out.println("Ingrese su nombre jugador2: ");
        Jugador2 = leer.nextLine();
        int opc1 = 5;
        
        while (opc1 != 4) {
            System.out.println("Podes elegir entre estas 3 razas, cada una tiene sus ventajas");
            System.out.println("1. Artistas Marciales: menor costo en edificaciones,milicia,vehiculos");
            System.out.println("2. Inframundo: mayor ataque de milicia y vehiculos");
            System.out.println("3. Operadores Especiales: mayor vida de milicia,vehiculos y edificaciones");
            System.out.println("Ingrese un numero");
            int opc2;
            opc2 = leer.nextInt();
            while(opc2!=4){
            switch (opc2) {
                case 1:
                    CreadorRaza raza1 = new CreadorRaza();
                    raza1.setRazaBuilder(new ArtistaMarcialBuilder());
                    Edificacion centromando1 = raza1.construirCentroMando();
                    System.out.println("se construyo: "+ centromando1.getNombre());
                    System.out.println("Vida: " + centromando1.getVida());
                    Recursos recursosiniciales=new Recursos(10000,5000,3000);
                    mostrarRecursos(recursosiniciales);
                    System.out.println("que desea hacer?");
                    System.out.println("1. crear");
                    System.out.println("2. atacar");
                    
                    switch(opc3){
                        
                    }
            }

        }
    }
