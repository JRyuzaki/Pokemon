package pokemons;

public abstract class Pokemon{

    private String name;
    private int pokedexNr;
    private int atk;
    private int def;
    private int HP;
    private int maxHP;
    private int speed;
    private int level;
    private String description;

    private int maxPossibleHP;
    private int maxPossibleATK;
    private int maxPossibleDEF;
    private int maxPossibleSpeed;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxPossibleHP() {
        return maxPossibleHP;
    }

    public void setMaxPossibleHP(int maxPossibleHP) {
        this.maxPossibleHP = maxPossibleHP;
    }

    public int getMaxPossibleATK() {
        return maxPossibleATK;
    }

    public void setMaxPossibleATK(int maxPossibleATK) {
        this.maxPossibleATK = maxPossibleATK;
    }

    public int getMaxPossibleDEF() {
        return maxPossibleDEF;
    }

    public void setMaxPossibleDEF(int maxPossibleDEF) {
        this.maxPossibleDEF = maxPossibleDEF;
    }

    public int getMaxPossibleSpeed() {
        return maxPossibleSpeed;
    }

    public void setMaxPossibleSpeed(int maxPossibleSpeed) {
        this.maxPossibleSpeed = maxPossibleSpeed;
    }

    public Pokemon(int pokedexNr, String name, String description){
        this.pokedexNr = pokedexNr;
        this.name = name;
        this.description = description;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokedexNr() {
        return pokedexNr;
    }

    public void setPokedexNr(int pokedexNr) {
        this.pokedexNr = pokedexNr;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void pokemonAngreifen(Pokemon pokemon){
        pokemon.setHP(pokemon.getHP() - this.atk);
    }

    public abstract String getSpezies();

    public abstract int getFangchance();

    public abstract void spezielleInteraktion(); //Als gutes Beispiel für das Überschreiben von Methoden
}