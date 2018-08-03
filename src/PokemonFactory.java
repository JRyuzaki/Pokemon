import pokemons.Pikachu;
import pokemons.Pokemon;

import java.util.Random;

public class PokemonFactory {
    private static Random random = new Random();

    private static int generateMaxHP(int level, int base) {
        return (base + random.nextInt(31)) * 2 * level / 100 + level + 10;
    }

    private static int generateLevel(int min, int max) {
        return random.nextInt(max-min) + min;
    }

    private static int generateStat(int level, int base) {
        return (base + random.nextInt(31)) * 2 * level / 100 + 5;
    }

    public static Pokemon erzeugePokemon(int pokedexNr){
        int level;
        switch (pokedexNr) {
            case 25:
                level = generateLevel(3, 15);
                Pokemon pikachu = new Pikachu(pokedexNr, "pokemons.Pikachu", generateMaxHP(level, 11));
                pikachu.setAtk(generateStat(level,4));
                pikachu.setDef(generateStat(level,4));
                pikachu.setSpeed(generateStat(level, 7));
                return pikachu;
            case 143:
                level = generateLevel(20, 40);
                Pokemon relaxo = new Pikachu(pokedexNr, "pokemons.Relaxo", generateMaxHP(level, 18));
                relaxo.setAtk(generateStat(level,6));
                relaxo.setDef(generateStat(level, 8));
                relaxo.setSpeed(generateStat(level, 1));
                return relaxo;
            default:
                return null;
        }
    }
}
