/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author Carlos
 */
public abstract class Pokemon {
    
    private int numPokedex;
    protected String nombre;
    private double peso;
    private String temporada;

    public Pokemon(int numPokedex, String nombre, double peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    // Métodos comunes para los ataques básicos
    public void atacarPlacaje() {
        System.out.println("Soy " + nombre + " y estoy atacando con Placaje");
    }

    public void atacarArañazo() {
        System.out.println("Soy " + nombre + " y estoy atacando con Arañazo");
    }

    public void atacarMordisco() {
        System.out.println("Soy " + nombre + " y estoy atacando con Mordisco");
    }
}
