package pokemons;

public class Mew extends Pokemon{
    public static final String spezies = "Mew";
    private static final String description = "Mew is a pink, bipedal Pokémon with mammalian features. Its snout is short and wide, and it has triangular ears and large, blue eyes. It has short arms with three-fingered paws, large hind legs and feet with oval markings on the soles, and a long, thin tail ending in an ovoid tip. Its fur is so fine and thin, it can only be seen under a microscope. Mew is said to have the DNA of every single Pokémon contained within its body, and as such is able to learn any attack.";

    public Mew(String name) {
        super(151, name, description);
        this.setMaxPossibleATK(100);
        this.setMaxPossibleHP(100);
        this.setMaxPossibleDEF(100);
        this.setMaxPossibleSpeed(100);
    }

    @Override
    public String getSpezies() {
        return spezies;
    }

    @Override
    public int getFangchance() {
        return 40;
    }

    @Override
    public void spezielleInteraktion() {
        System.out.println("Mew tells you about chemtrails");
    }
}
