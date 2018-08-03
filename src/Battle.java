import java.util.Scanner;

public class Battle {
    Trainer t1;
    Trainer t2;
    static Scanner sc = new Scanner(System.in);


    public Battle(Trainer t1, Trainer t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    //Simuliert den Kampf und returnt den Sieger
    public Trainer kampf() {
        Trainer curTrainer = t2;
        Trainer notCurTrainer = t1;
        Trainer tmp;
        while (t1.getKampffaehigePokemon() > 0 && t2.getKampffaehigePokemon() > 0) {
            tmp = curTrainer;
            curTrainer = notCurTrainer;
            notCurTrainer = tmp;
            switch (curTrainer.battleInput()) {
                case 1:
                    //Angreifen
                case 2:
                    //Item
                case 3:
                    //Pokemon
                case 4:
                    //Flüchten
                default:
                    return null;
            }
        }
    }
}
