/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

    public class Pikachu extends Pokemon implements PokemonElectrico {
    public Pikachu() {
        super(25, "Pikachu", 6.0, "Primera temporada");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPuñoTrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo Carga");
    }
}
