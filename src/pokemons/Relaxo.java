package pokemons;

import pokemons.Pokemon;

public class Relaxo extends Pokemon {
    private static final String spezies = "pokemons.Relaxo";
    private static final int fangchance = 20;
    private static final String description = "bla";

    public Relaxo(int pokedexNr, String name, int maxHP) {
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
        System.out.println("pokemons.Relaxo schläft");
    }
}
