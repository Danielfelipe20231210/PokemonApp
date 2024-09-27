/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.pokemon.main;

import autonoma.pokemon.models.Bulbasaur;
import autonoma.pokemon.models.Charmander;
import autonoma.pokemon.models.Pikachu;
import autonoma.pokemon.models.Squirtle;

/**
 *
 * @author Carlos
 */
public class PokemonApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();

        // Ataques de Charmander
        charmander.atacarPlacaje();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();

        // Ataques de Bulbasaur
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarHojaAfilada();

        // Ataques de Squirtle
        squirtle.atacarPlacaje();
        squirtle.atacarPistolaAgua();
        squirtle.atacarHidrobomba();

        // Ataques de Pikachu
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        pikachu.atacarRayo();
    }
}

    

