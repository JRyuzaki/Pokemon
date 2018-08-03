import pokemons.Pokemon;

public class Pokedex {
    private static final int MAX_POKEMON = 151;
    private PokedexEintrag[] pokedexEintraege;
    private int gefangenePokemon;

    public Pokedex(){
        this.pokedexEintraege = new PokedexEintrag[MAX_POKEMON];
        this.gefangenePokemon = 0;
    }

    public void fuegePokemonInPokedexEin(Pokemon pokemon){
        if(this.pokedexEintraege[pokemon.getPokedexNr() - 1] == null){
            ++this.gefangenePokemon;
            PokedexEintrag eintrag = new PokedexEintrag(pokemon.getSpezies(), "", Typ.Boden);
            this.pokedexEintraege[pokemon.getPokedexNr() - 1] = eintrag;
        }
    }

    public PokedexEintrag getPokedexEintragByName(String name){
        for(int i = 0; i < MAX_POKEMON; ++i){
            if(this.pokedexEintraege[i] != null) {
                if (this.pokedexEintraege[i].getSpezies().equals(name)) {
                    return this.pokedexEintraege[i];
                }
            }
        }
        return null;
    }

    public PokedexEintrag getPokedexEintragByNr(int pokedexNr){
        return this.pokedexEintraege[pokedexNr];
    }

    public static int getMaxPokemon() {
        return MAX_POKEMON;
    }

    public PokedexEintrag[] getPokemons() {
        return pokedexEintraege;
    }

    public void setPokemons(PokedexEintrag[] eintraege) {
        this.pokedexEintraege = eintraege;
    }

    public int getGefangenePokemon() {
        return gefangenePokemon;
    }

    public void setGefangenePokemon(int gefangenePokemon) {
        this.gefangenePokemon = gefangenePokemon;
    }
}
