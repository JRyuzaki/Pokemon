package pokemons;

import pokemons.Pokemon;

public class Pikachu extends Pokemon {

    private static final String spezies = "pokemons.Pikachu";
    private static final int fangchance = 50;
    private static final String description = "bla";

    public Pikachu(int pokedexNr, String name, int maxHP) {
        super(pokedexNr, name, description);
    }

    @Override
    public String getSpezies() {
        return spezies;
    }

    @Override
    public int getFangchance() {
        return fangchance;
    }

    @Override
    public void spezielleInteraktion() {
        System.out.println("pokemons.Pikachu schaut dich an...");
    }

    @Override
    public void pokemonAngreifen(Pokemon pokemon) {
        super.pokemonAngreifen(pokemon);
        //Spezielle Effekte verwenden
    }


}
