public enum Typ {
    Feuer, Wasser, Pflanze, Boden, Stahl, Stein, Geist, Psycho, Drache, Gift, Kaefer, Flug, Eis, Kampf, Unlicht, Elektro, Normal;

    //Soll den Multiplikator*2 beim Angreifen zurückgeben
    public static int typvorteil(Typ angreifer, Typ verteidiger) {
        switch(angreifer) {
            case Normal:
                if (verteidiger == Geist)
                    return 0;
                if (verteidiger == Stein || verteidiger == Stahl)
                    return 1;
                else
                    return 2;
            case Kampf:
                if (verteidiger == Geist)
                    return 0;
                if (verteidiger == Kaefer || verteidiger == Flug || verteidiger == Gift || verteidiger == Psycho)
                    return 1;
                if (verteidiger == Normal || verteidiger == Stein || verteidiger == Stahl || verteidiger == Eis || verteidiger == Unlicht)
                    return 4;
                else
                    return 2;
            case Flug:
                if (verteidiger == Stein || verteidiger == Stahl || verteidiger == Elektro)
                    return 1;
                if (verteidiger == Flug || verteidiger == Kaefer || verteidiger == Pflanze)
                    return 4;
                else
                    return 2;
            case Gift:
                if (verteidiger == Stahl)
                    return 0;
                if (verteidiger == Gift || verteidiger == Boden || verteidiger == Stein || verteidiger == Geist)
                    return 1;
                if (verteidiger == Pflanze)
                    return 4;
                else
                    return 2;
            case Boden:
                if (verteidiger == Flug)
                    return 0;
                if (verteidiger == Kaefer || verteidiger == Pflanze)
                    return 1;
                if (verteidiger == Gift || verteidiger == Stahl || verteidiger == Stein || verteidiger == Feuer || verteidiger == Elektro)
                    return 4;
        }
        return 2;
    }

    public String toString() {
        switch(this) {
            case Eis:
                return "Eis";
            case Flug:
                return "Flug";
            case Gift:
                return "Gift";
            case Boden:
                return "Boden";
            case Feuer:
                return "Feuer";
            case Geist:
                return "Geist";
            case Kampf:
                return "Kampf";
            case Stahl:
                return "Stahl";
            case Stein:
                return "Stein";
            case Drache:
                return "Drache";
            case Kaefer:
                return "Kaefer";
            case Normal:
                return "Normal";
            case Psycho:
                return "Psycho";
            case Wasser:
                return "Wasser";
            case Elektro:
                return "Elektro";
            case Pflanze:
                return "Pflanze";
            case Unlicht:
                return "Unlicht";
            default:
                return null;
        }
    }
}
