import pokemons.Pokemon;

import java.util.Random;

public class Trainer {
    private static long trainerCounter;

    private long ID;
    private String name;
    private Pokemon[] teamPokemon;
    private Pokedex pokedex;
    private static Random random = new Random();

    public Trainer(String name) {
        this.name = name;
        this.teamPokemon = new Pokemon[6];
        this.ID = trainerCounter++;
        this.pokedex = new Pokedex();
    }

    public Pokemon getPokemonByIndex(int index){
        return this.teamPokemon[index];
    }

    public void fuegePokemonZumTeam(Pokemon pokemon, int stelle){
        this.teamPokemon[stelle] = pokemon;
    }

    public void entfernePokemonAusTeam(int stelle){
        this.teamPokemon[stelle] = null;
    }

    public void fangePokemon(Pokemon pokemon){
        int fangChance = random.nextInt(100);
        System.out.println(this.name + " hat einen Pokeball geworfen!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(fangChance >= pokemon.getFangchance()){
            System.out.println(pokemon.getSpezies() + " wurde gefangen!");
            this.pokedex.fuegePokemonInPokedexEin(pokemon);
            boolean pokemonZumTeamHinzugefuegt = false;
            for(int i = 0; i < 6; ++i){
                if(this.teamPokemon[i] == null){
                    this.teamPokemon[i] = pokemon;
                    pokemonZumTeamHinzugefuegt = true;
                    System.out.println("Das pokemons.Pokemon befindet sich nun in deinem Team");
                    break;
                }
            }
            if(pokemonZumTeamHinzugefuegt == false){
                System.out.println("Du wurde nicht in dein Team eingefügt, weil du keinen Platz hast");
                // Mögliche Erweiterung mit Computer
            }
        } else {
            System.out.println(pokemon.getSpezies() + " ist ausgebrochen!");
        }
    }
}
