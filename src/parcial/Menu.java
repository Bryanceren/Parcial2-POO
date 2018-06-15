/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import parcial.Raza.Edificacion.Edificacion;
import parcial.Raza.Milicia.Milicia;
import parcial.Raza.Milicia.MiliciaFactory;
import parcial.Raza.RazaFactory;
import parcial.Raza.Recursos;
import parcial.Raza.Vehiculo.Vehiculo;
import parcial.Raza.Vehiculo.VehiculoFactory;
import parcial.RazaBuilder.ArtistaMarcialBuilder;
import parcial.RazaBuilder.CreadorRaza;
import parcial.RazaBuilder.InframundoBuilder;
import parcial.RazaBuilder.OperadorEspecialBuilder;

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

    public void mostrarRecursos(Recursos recursos) {
        System.out.println("Recursos : ");
        System.out.println("Recurso1: " + recursos.getRecurso1());
        System.out.println("Recurso2: " + recursos.getRecurso2());
        System.out.println("Recurso3: " + recursos.getRecurso3());
    }

    public void mostrarEdificacion(Edificacion edificacion) {
        System.out.println("Edificacion : ");
        System.out.println("Nombre: " + edificacion.getNombre());
        System.out.println("Vida: " + edificacion.getVida());

    }

    public void mostrarMilicia(Milicia milicia) {
        System.out.println("Milicia : ");
        System.out.println("nombre: " + milicia.getNombre());
        System.out.println("vida: " + milicia.getVida());
        System.out.println("ataque: " + milicia.getAtaque());
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {
        System.out.println("Vehiculo : ");
        System.out.println("nombre: " + vehiculo.getNombre());
        System.out.println("vida: " + vehiculo.getVida());
        System.out.println("ataque: " + vehiculo.getAtaque());
    }

    public void buscarEdificacion(ArrayList<Edificacion> edificaciones) {
        for (Edificacion edificacion : edificaciones) {
            mostrarEdificacion(edificacion);
        }
    }

    public void buscarVehiculos(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            mostrarVehiculo(vehiculo);
        }
    }

    public void buscarMilicias(ArrayList<Milicia> milicias) {
        for (Milicia milicia : milicias) {
            mostrarMilicia(milicia);
        }
    }

    public ArrayList<Edificacion> atacarEdificacionVehiculo(ArrayList<Edificacion> edificaciones, Vehiculo vehiculo, String edificacionataque) {

        Iterator<Edificacion> it = edificaciones.iterator();

        while (it.hasNext()) {

            Edificacion edificacion = it.next();
            if (edificacion.getNombre().equals(edificacionataque)) {
                vehiculo.AtaqueEdificacion(edificacion);
                System.out.println("Realizando ataque!!! qwjdfgqwqf1");
            } else {
                if (edificacion.getVida() < 0) {
                    edificaciones.remove(edificacion);
                }
            }

        }
        return edificaciones;
    }

    public ArrayList<Edificacion> atacarEdificacionMilicia(ArrayList<Edificacion> edificaciones, Milicia milicia, String edificacionataque) {
        Iterator<Edificacion> it = edificaciones.iterator();

        while (it.hasNext()) {

            Edificacion edificacion = it.next();
            if (edificacion.getNombre().equals(edificacionataque)) {
                milicia.AtaqueEdificacion(edificacion);
                System.out.println("Realizando ataque!!! qwjdfgqwqf1");
            }else{
            if (edificacion.getVida() < 0) {
                edificaciones.remove(edificacion);
            }
            }
        }
        return edificaciones;
    }

    public ArrayList<Milicia> atacarMiliciaVehiculo(ArrayList<Milicia> milicias, Vehiculo vehiculo, String miliciaataque) {
        Iterator<Milicia> it = milicias.iterator();

        while (it.hasNext()) {

            Milicia milicia = it.next();
            if (milicia.getNombre().equals(miliciaataque)) {
                vehiculo.AtaqueMilicia(milicia);
                System.out.println("Realizando ataque!!! qwjdfgqwqf1");
            }else{
            if (milicia.getVida() < 0) {
                milicias.remove(milicia);
            }
            }
        }
        return milicias;
    }

    public ArrayList<Vehiculo> atacarVehiculoMilicia(ArrayList<Vehiculo> vehiculos, Milicia milicia, String vehiculoataque) {

        Iterator<Vehiculo> it = vehiculos.iterator();

        while (it.hasNext()) {

            Vehiculo vehiculo = it.next();
            if (milicia.getNombre().equals(vehiculoataque)) {
                milicia.AtaqueVehiculo(vehiculo);
                System.out.println("Realizando ataque!!! qwjdfgqwqdwqf1");
            }else{
            if (vehiculo.getVida() < 0) {
                vehiculos.remove(vehiculo);
            }
            }
        }
        return vehiculos;

    }

    public void Inicio() {
        String Jugador1, Jugador2;
        boolean jugador1, jugador2;
        jugador1 = true;
        jugador2 = true;
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Bienvenido a Bryan's World!!");
        System.out.println("Ingrese su nombre jugardor1: ");
        Jugador1 = leer.nextLine();
        System.out.println("Ingrese su nombre jugador2: ");
        Jugador2 = leer.nextLine();

        String[] jugadores = {Jugador1, Jugador2};
        Recursos[] recursosjugadores = new Recursos[2];
        ArrayList<Edificacion> edificaciones1 = new ArrayList<>();
        ArrayList<Edificacion> edificaciones2 = new ArrayList<>();
        ArrayList<Edificacion> edificaciones3 = new ArrayList<>();
        ArrayList<Milicia> milicia1 = new ArrayList<>();
        ArrayList<Milicia> milicia2 = new ArrayList<>();
        ArrayList<Milicia> milicia3 = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos1 = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos3 = new ArrayList<>();

        Recursos recursosiniciales = new Recursos(10000, 5000, 3000);

        int opc1 = 5;

        int[] opciones = new int[2];
        int[] opciones2 = new int[2];

        CreadorRaza raza1 = new CreadorRaza();
        CreadorRaza raza2 = new CreadorRaza();
        CreadorRaza raza3 = new CreadorRaza();
        for (int i = 0; i < 2; i++) {

            System.out.println("\nJugador" + jugadores[i]);
            System.out.println("Podes elegir entre estas 3 razas, cada una tiene sus ventajas");
            System.out.println("1. Artistas Marciales: menor costo en edificaciones,milicia,vehiculos");
            System.out.println("2. Inframundo: mayor ataque de milicia y vehiculos");
            System.out.println("3. Operadores Especiales: mayor vida de milicia,vehiculos y edificaciones");
            System.out.println("Ingrese un numero");

            opciones[i] = leer.nextInt();

            switch (opciones[i]) {
                case 1:

                    raza1.setRazaBuilder(new ArtistaMarcialBuilder());
                    Edificacion centromando1 = raza1.construirCentroMando();
                    edificaciones1.add(centromando1);
                    System.out.println("se construyo: " + centromando1.getNombre());
                    System.out.println("Vida: " + centromando1.getVida());
                    recursosjugadores[i] = recursosiniciales;
                    mostrarRecursos(recursosjugadores[i]);
                    break;
                case 2:

                    raza2.setRazaBuilder(new InframundoBuilder());
                    Edificacion centromando2 = raza2.construirCentroMando();
                    edificaciones2.add(centromando2);
                    System.out.println("se construyo: " + centromando2.getNombre());
                    System.out.println("Vida: " + centromando2.getVida());
                    recursosjugadores[i] = recursosiniciales;
                    mostrarRecursos(recursosjugadores[i]);

                    break;

                case 3:

                    raza3.setRazaBuilder(new OperadorEspecialBuilder());
                    Edificacion centromando3 = raza3.construirCentroMando();
                    edificaciones3.add(centromando3);
                    System.out.println("se construyo: " + centromando3.getNombre());
                    System.out.println("Vida: " + centromando3.getVida());
                    recursosjugadores[i] = recursosiniciales;
                    mostrarRecursos(recursosjugadores[i]);
                    break;
            }
        }
        int j = 0;
        boolean flag = true;
        while (jugador1 && jugador2) {
            if (flag == true) {
                j = 0;
            } else {
                j = 1;
            }

            System.out.println(jugadores[j]);
            System.out.println("que edificacion desea crear?");
            if (opciones[j] == 1) {
                System.out.println("1.granja(recurso1)");
                System.out.println("2.gym(recurso2)");
                System.out.println("3.herreria(recurso3)");
                System.out.println("4.nido(vehiculos)");
                System.out.println("5.cabanas(milicia)");
                int a;
                a = leer.nextInt();
                switch (a) {
                    case 1:
                        Edificacion granja = raza1.construirEdificacionRecurso1(recursosjugadores[j]);
                        edificaciones1.add(granja);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(granja);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        granja.generar(recursosjugadores[j]);
                        System.out.println(granja.getNombre() + " granja genero recursos1");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 2:
                        Edificacion gym = raza1.construirEdificacionRecurso2(recursosjugadores[j]);
                        edificaciones1.add(gym);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(gym);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        gym.generar(recursosjugadores[j]);
                        System.out.println(gym.getNombre() + " gym genero recursos2");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 3:
                        Edificacion herreria = raza1.construirEdificacionRecurso3(recursosjugadores[j]);
                        edificaciones1.add(herreria);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(herreria);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        herreria.generar(recursosjugadores[j]);
                        System.out.println(herreria.getNombre() + " herreria genero recursos3");
                        mostrarRecursos(recursosjugadores[j]);
                        break;

                    case 4:
                        Edificacion nido = raza1.construirEdificacionVehiculo(recursosjugadores[j]);
                        edificaciones1.add(nido);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(nido);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que vehiculo quieres?\n1.dragon\n2.tigre");
                        int f;
                        f = leer.nextInt();
                        switch (f) {
                            case 1:
                                VehiculoFactory dragones = nido.crearVehiculo();
                                Vehiculo dragon = dragones.getVehiculo(1);
                                dragon.setNombre("Dragon");
                                dragon.setAtaque(900);
                                dragon.setVida(500);
                                mostrarVehiculo(dragon);
                                vehiculos1.add(dragon);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones2);
                                buscarEdificacion(edificaciones3);
                                buscarMilicias(milicia2);
                                buscarMilicias(milicia3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones2, dragon, nombre);
                                    atacarMiliciaVehiculo(milicia2, dragon, nombre);
                                    atacarEdificacionVehiculo(edificaciones3, dragon, nombre);
                                    atacarMiliciaVehiculo(milicia3, dragon, nombre);
                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                VehiculoFactory tigres = nido.crearVehiculo();
                                Vehiculo tigre = tigres.getVehiculo(2);
                                tigre.setNombre("Tigre");
                                tigre.setAtaque(500);
                                tigre.setVida(250);
                                mostrarVehiculo(tigre);
                                vehiculos1.add(tigre);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones2);
                                buscarEdificacion(edificaciones3);
                                buscarMilicias(milicia2);
                                buscarMilicias(milicia3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int y;
                                y = leer.nextInt();

                                if (y == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones2, tigre, nombre);
                                    atacarMiliciaVehiculo(milicia2, tigre, nombre);
                                    atacarEdificacionVehiculo(edificaciones3, tigre, nombre);
                                    atacarMiliciaVehiculo(milicia3, tigre, nombre);
                                } else {
                                    break;
                                }
                                break;
                        }
                        break;
                    case 5:
                        Edificacion cabanas = raza1.construirEdificacionMilicia(recursosjugadores[j]);
                        edificaciones1.add(cabanas);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(cabanas);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que milicia quieres?\n1.ninjas\n2.samurai");
                        int q;
                        q = leer.nextInt();
                        switch (q) {
                            case 1:
                                MiliciaFactory ninjas = cabanas.crearMilicia();
                                Milicia ninja = ninjas.getMilicia(1);
                                ninja.setNombre("Ninjas");
                                ninja.setAtaque(1000);
                                ninja.setVida(500);
                                mostrarMilicia(ninja);
                                milicia1.add(ninja);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones2);
                                buscarEdificacion(edificaciones3);
                                buscarVehiculos(vehiculos2);
                                buscarVehiculos(vehiculos3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones2, ninja, nombre);
                                    atacarVehiculoMilicia(vehiculos2, ninja, nombre);
                                    atacarEdificacionMilicia(edificaciones3, ninja, nombre);
                                    atacarVehiculoMilicia(vehiculos3, ninja, nombre);

                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                MiliciaFactory samurais = cabanas.crearMilicia();
                                Milicia samurai = samurais.getMilicia(1);
                                samurai.setNombre("Samurai");
                                samurai.setAtaque(1000);
                                samurai.setVida(1000);
                                mostrarMilicia(samurai);
                                milicia1.add(samurai);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones2);
                                buscarEdificacion(edificaciones3);
                                buscarVehiculos(vehiculos2);
                                buscarVehiculos(vehiculos3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int w;
                                w = leer.nextInt();

                                if (w == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones2, samurai, nombre);
                                    atacarVehiculoMilicia(vehiculos2, samurai, nombre);
                                    atacarEdificacionMilicia(edificaciones3, samurai, nombre);
                                    atacarVehiculoMilicia(vehiculos3, samurai, nombre);

                                } else {
                                    break;
                                }
                                break;
                        }
                        break;

                }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
//////////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
//////////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
///////////////////////////////////////////////////////////////////////////////////////////////////////////raza2
            }
            if (opciones[j] == 2) {
                System.out.println("1.agujero(recurso1)");
                System.out.println("2.casaBrujos(recurso2)");
                System.out.println("3.pozoSangre(recurso3)");
                System.out.println("4.portal(vehiculos)");
                System.out.println("5.cementerio(milicia)");
                int a;
                a = leer.nextInt();
                switch (a) {
                    case 1:
                        Edificacion agujero = raza2.construirEdificacionRecurso1(recursosjugadores[j]);
                        edificaciones2.add(agujero);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(agujero);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        agujero.generar(recursosjugadores[j]);
                        System.out.println(agujero.getNombre() + "  genero recursos1");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 2:
                        Edificacion casaBrujos = raza2.construirEdificacionRecurso2(recursosjugadores[j]);
                        edificaciones2.add(casaBrujos);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(casaBrujos);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        casaBrujos.generar(recursosjugadores[j]);
                        System.out.println(casaBrujos.getNombre() + "  genero recursos2");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 3:
                        Edificacion pozoSangre = raza2.construirEdificacionRecurso3(recursosjugadores[j]);
                        edificaciones2.add(pozoSangre);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(pozoSangre);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        pozoSangre.generar(recursosjugadores[j]);
                        System.out.println(pozoSangre.getNombre() + "  genero recursos3");
                        mostrarRecursos(recursosjugadores[j]);
                        break;

                    case 4:
                        Edificacion portal = raza2.construirEdificacionVehiculo(recursosjugadores[j]);
                        edificaciones2.add(portal);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(portal);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que vehiculo quieres?\n1.gargola\n2.demonio");
                        int f;
                        f = leer.nextInt();
                        switch (f) {
                            case 1:
                                VehiculoFactory gargolas = portal.crearVehiculo();
                                Vehiculo gargola = gargolas.getVehiculo(1);
                                gargola.setNombre("gargola");
                                gargola.setAtaque(2500);
                                gargola.setVida(500);
                                mostrarVehiculo(gargola);
                                vehiculos2.add(gargola);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones3);
                                buscarMilicias(milicia1);
                                buscarMilicias(milicia3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones1, gargola, nombre);
                                    atacarMiliciaVehiculo(milicia1, gargola, nombre);
                                    atacarEdificacionVehiculo(edificaciones3, gargola, nombre);
                                    atacarMiliciaVehiculo(milicia3, gargola, nombre);
                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                VehiculoFactory demonios = portal.crearVehiculo();
                                Vehiculo demonio = demonios.getVehiculo(2);
                                demonio.setNombre("demonio");
                                demonio.setAtaque(3000);
                                demonio.setVida(250);
                                mostrarVehiculo(demonio);
                                vehiculos2.add(demonio);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones3);
                                buscarMilicias(milicia1);
                                buscarMilicias(milicia3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int y;
                                String nombre;
                                y = leer.nextInt();

                                if (y == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones1, demonio, nombre);
                                    atacarMiliciaVehiculo(milicia1, demonio, nombre);
                                    atacarEdificacionVehiculo(edificaciones3, demonio, nombre);
                                    atacarMiliciaVehiculo(milicia3, demonio, nombre);
                                } else {
                                    break;
                                }
                                break;
                        }
                        break;
                    case 5:
                        Edificacion cementerio = raza2.construirEdificacionMilicia(recursosjugadores[j]);
                        edificaciones2.add(cementerio);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(cementerio);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que milicia quieres?\n1.esqueletos\n2.brujo");
                        int q;
                        q = leer.nextInt();
                        switch (q) {
                            case 1:
                                MiliciaFactory esqueletos = cementerio.crearMilicia();
                                Milicia esqueleto = esqueletos.getMilicia(1);
                                esqueleto.setNombre("esqueletos");
                                esqueleto.setAtaque(3500);
                                esqueleto.setVida(500);
                                mostrarMilicia(esqueleto);
                                milicia2.add(esqueleto);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones3);
                                buscarVehiculos(vehiculos1);
                                buscarVehiculos(vehiculos3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones1, esqueleto, nombre);
                                    atacarVehiculoMilicia(vehiculos1, esqueleto, nombre);
                                    atacarEdificacionMilicia(edificaciones3, esqueleto, nombre);
                                    atacarVehiculoMilicia(vehiculos3, esqueleto, nombre);

                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                MiliciaFactory brujos = cementerio.crearMilicia();
                                Milicia brujo = brujos.getMilicia(1);
                                brujo.setNombre("brujo");
                                brujo.setAtaque(5000);
                                brujo.setVida(1000);
                                mostrarMilicia(brujo);
                                milicia2.add(brujo);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones3);
                                buscarVehiculos(vehiculos1);
                                buscarVehiculos(vehiculos3);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int w;
                                w = leer.nextInt();

                                if (w == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones1, brujo, nombre);
                                    atacarVehiculoMilicia(vehiculos1, brujo, nombre);
                                    atacarEdificacionMilicia(edificaciones3, brujo, nombre);
                                    atacarVehiculoMilicia(vehiculos3, brujo, nombre);

                                } else {
                                    break;
                                }
                                break;
                        }
                        break;

                }

            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////raza3           
            if (opciones[j] == 3) {
                System.out.println("1.granja(recurso1)");
                System.out.println("2.armeria(recurso2)");
                System.out.println("3.fabrica(recurso3)");
                System.out.println("4.taller(vehiculos)");
                System.out.println("5.ayuntamiento(milicia)");
                int a;
                a = leer.nextInt();
                switch (a) {
                    case 1:
                        Edificacion granja = raza3.construirEdificacionRecurso1(recursosjugadores[j]);
                        edificaciones3.add(granja);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(granja);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        granja.generar(recursosjugadores[j]);
                        System.out.println(granja.getNombre() + "  genero recursos1");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 2:
                        Edificacion armeria = raza3.construirEdificacionRecurso2(recursosjugadores[j]);
                        edificaciones3.add(armeria);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(armeria);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        armeria.generar(recursosjugadores[j]);
                        System.out.println(armeria.getNombre() + "  genero recursos2");
                        mostrarRecursos(recursosjugadores[j]);
                        break;
                    case 3:
                        Edificacion fabrica = raza3.construirEdificacionRecurso3(recursosjugadores[j]);
                        edificaciones3.add(fabrica);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(fabrica);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        fabrica.generar(recursosjugadores[j]);
                        System.out.println(fabrica.getNombre() + "  genero recursos3");
                        mostrarRecursos(recursosjugadores[j]);
                        break;

                    case 4:
                        Edificacion taller = raza3.construirEdificacionVehiculo(recursosjugadores[j]);
                        edificaciones3.add(taller);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(taller);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que vehiculo quieres?\n1.tanque\n2.dron");
                        int f;
                        f = leer.nextInt();
                        switch (f) {
                            case 1:
                                VehiculoFactory tanques = taller.crearVehiculo();
                                Vehiculo tanque = tanques.getVehiculo(1);
                                tanque.setNombre("tanque");
                                tanque.setAtaque(1000);
                                tanque.setVida(3000);
                                mostrarVehiculo(tanque);
                                vehiculos3.add(tanque);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones2);
                                buscarMilicias(milicia1);
                                buscarMilicias(milicia2);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones1, tanque, nombre);
                                    atacarMiliciaVehiculo(milicia1, tanque, nombre);
                                    atacarEdificacionVehiculo(edificaciones2, tanque, nombre);
                                    atacarMiliciaVehiculo(milicia2, tanque, nombre);
                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                VehiculoFactory drones = taller.crearVehiculo();
                                Vehiculo dron = drones.getVehiculo(2);
                                dron.setNombre("dron");
                                dron.setAtaque(1000);
                                dron.setVida(3000);
                                mostrarVehiculo(dron);
                                vehiculos3.add(dron);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones2);
                                buscarMilicias(milicia1);
                                buscarMilicias(milicia2);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int y;
                                y = leer.nextInt();

                                if (y == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionVehiculo(edificaciones1, dron, nombre);
                                    atacarMiliciaVehiculo(milicia1, dron, nombre);
                                    atacarEdificacionVehiculo(edificaciones2, dron, nombre);
                                    atacarMiliciaVehiculo(milicia2, dron, nombre);
                                } else {
                                    break;
                                }
                                break;
                        }
                        break;
                    case 5:
                        Edificacion ayuntamiento = raza3.construirEdificacionMilicia(recursosjugadores[j]);
                        edificaciones3.add(ayuntamiento);
                        System.out.println("Construyo: ");
                        mostrarEdificacion(ayuntamiento);
                        mostrarRecursos(recursosjugadores[j]);
                        System.out.println("...");
                        System.out.println("que milicia quieres?\n1.soldados\n2.bombardero");
                        int q;
                        q = leer.nextInt();
                        switch (q) {
                            case 1:
                                MiliciaFactory soldados = ayuntamiento.crearMilicia();
                                Milicia soldado = soldados.getMilicia(1);
                                soldado.setNombre("soldados");
                                soldado.setAtaque(700);
                                soldado.setVida(3500);
                                mostrarMilicia(soldado);
                                milicia3.add(soldado);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones2);
                                buscarVehiculos(vehiculos1);
                                buscarVehiculos(vehiculos2);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int g;
                                g = leer.nextInt();

                                if (g == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones1, soldado, nombre);
                                    atacarVehiculoMilicia(vehiculos1, soldado, nombre);
                                    atacarEdificacionMilicia(edificaciones2, soldado, nombre);
                                    atacarVehiculoMilicia(vehiculos2, soldado, nombre);

                                } else {
                                    break;
                                }
                                break;
                            case 2:
                                MiliciaFactory bombarderos = ayuntamiento.crearMilicia();
                                Milicia bombardero = bombarderos.getMilicia(1);
                                bombardero.setNombre("bombardero");
                                bombardero.setAtaque(1000);
                                bombardero.setVida(5000);
                                mostrarMilicia(bombardero);
                                milicia3.add(bombardero);
                                System.out.println("Lista de cosas que puedes atacar");
                                buscarEdificacion(edificaciones1);
                                buscarEdificacion(edificaciones2);
                                buscarVehiculos(vehiculos1);
                                buscarVehiculos(vehiculos2);
                                System.out.println("desea atacar? (1 para si, 0 para no)");
                                int w;
                                w = leer.nextInt();

                                if (w == 1) {
                                    System.out.println("Escriba el nombre de lo que quiere atacar(mostrara mensaje de ataque si es exitoso)");
                                    String nombre = leer2.nextLine();
                                    atacarEdificacionMilicia(edificaciones1, bombardero, nombre);
                                    atacarVehiculoMilicia(vehiculos1, bombardero, nombre);
                                    atacarEdificacionMilicia(edificaciones2, bombardero, nombre);
                                    atacarVehiculoMilicia(vehiculos2, bombardero, nombre);

                                } else {
                                    break;
                                }
                                break;
                        }
                        break;

                }

            }

            if (flag == true) {
                flag = false;
            } else {
                flag = true;
            }
            if (opciones[j] == 1) {
                if (edificaciones1.isEmpty()) {
                    System.out.println("el jugador" + jugadores[j] + " fue el perdedor");
                    jugador1 = false;
                }
            }
            if (opciones[j] == 2) {
                if (edificaciones2.isEmpty()) {
                    System.out.println("el jugador" + jugadores[j] + " fue el perdedor");
                    jugador1 = false;
                }
            }
            if (opciones[j] == 3) {
                if (edificaciones3.isEmpty()) {
                    System.out.println("el jugador" + jugadores[j] + " fue el perdedor");
                    jugador1 = false;
                }
            }

        }

    }

//        while(true){
//            
//        }
}
