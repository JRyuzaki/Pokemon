public class PokedexEintrag {
    private String spezies;
    private String beschreibung;
    private Typ typ;

    public PokedexEintrag(String spezies, String description, Typ typ) {
        this.spezies = spezies;
        this.beschreibung = beschreibung;
        this.typ = typ;
    }

    public void zeigePokedexEintrag() {
        System.out.println(  "Spezies: " + spezies + "\n" +
                "Typ: " + typ.toString() + "\n" +
                "Beschreibung: " + beschreibung + "\n");
    }

    public String getSpezies(){
        return this.spezies;
    }
}
