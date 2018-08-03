public enum Typ {
    Feuer, Wasser, Pflanze, Boden, Stein, Geist, Psycho, Drache, Gift, Kaefer, Flug, Eis, Kampf, Elektro, Normal;

    //Soll den Multiplikator*2 beim Angreifen zurückgeben
    public static int typvorteil(Typ angreifer, Typ verteidiger) {
        switch(angreifer) {
            case Normal:
                if (verteidiger == Geist)
                    return 0;
                if (verteidiger == Stein)
                    return 1;
                else
                    return 2;
            case Kampf:
                if (verteidiger == Geist)
                    return 0;
                if (verteidiger == Kaefer || verteidiger == Flug || verteidiger == Gift || verteidiger == Psycho)
                    return 1;
                if (verteidiger == Normal || verteidiger == Stein || verteidiger == Eis)
                    return 4;
                else
                    return 2;
            case Flug:
                if (verteidiger == Stein || verteidiger == Elektro)
                    return 1;
                if (verteidiger == Flug || verteidiger == Kaefer || verteidiger == Pflanze)
                    return 4;
                else
                    return 2;
            case Gift:
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
                if (verteidiger == Gift || verteidiger == Stein || verteidiger == Feuer || verteidiger == Elektro)
                    return 4;
                else
                    return 2;
            case Stein:
                if (verteidiger == Kampf || verteidiger == Boden)
                    return 1;
                if (verteidiger == Flug || verteidiger == Kaefer || verteidiger == Feuer || verteidiger == Eis)
                    return 4;
                else
                    return 2;
            case Kaefer:
                if (verteidiger == Kampf || verteidiger == Flug || verteidiger == Kaefer || verteidiger == Geist || verteidiger ==  Feuer)
                    return 1;
                if (verteidiger == Pflanze || verteidiger == Psycho)
                    return 4;
                else
                    return 2;
            case Geist:
                if (verteidiger == Normal || verteidiger == Psycho)
                    return 0;
                if (verteidiger == Geist)
                    return 4;
                else
                    return 2;
            case Feuer:
                if (verteidiger == Stein || verteidiger == Feuer || verteidiger == Wasser || verteidiger == Drache)
                    return 1;
                if (verteidiger == Kaefer || verteidiger == Pflanze || verteidiger == Eis)
                    return 4;
                else
                    return 2;
            case Wasser:
                if (verteidiger == Wasser || verteidiger == Pflanze || verteidiger == Drache)
                    return 1;
                if (verteidiger == Boden || verteidiger == Stein || verteidiger == Feuer)
                    return 4;
                else
                    return 2;
            case Pflanze:
                if (verteidiger == Flug || verteidiger == Gift || verteidiger == Feuer || verteidiger == Kaefer || verteidiger == Pflanze || verteidiger == Drache)
                    return 1;
                if (verteidiger == Boden || verteidiger == Stein || verteidiger == Wasser)
                    return 4;
                else
                    return 2;
            case Elektro:
                if (verteidiger == Boden)
                    return 0;
                if (verteidiger == Pflanze || verteidiger == Elektro || verteidiger == Drache)
                    return 1;
                if (verteidiger == Flug || verteidiger == Wasser)
                    return 4;
                else
                    return 2;
            case Psycho:
                if (verteidiger == Psycho)
                    return 1;
                if (verteidiger == Kampf || verteidiger == Gift)
                    return 4;
                else
                    return 2;
            case Eis:
                if (verteidiger == Wasser || verteidiger == Eis)
                    return 1;
                if (verteidiger == Flug || verteidiger == Boden || verteidiger == Pflanze || verteidiger == Drache)
                    return 4;
                else
                    return 2;
            case Drache:
                if (verteidiger == Drache)
                    return 2;
                else
                    return 1;
            default:
                return 2;
        }
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
            default:
                return null;
        }
    }
}
