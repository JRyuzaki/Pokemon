import java.util.Scanner;

public class Avatar extends Trainer{
    static Scanner sc = new Scanner(System.in);

    public Avatar(String name) {
        super(name);
    }

    @Override
    public int battleInput() {
        int i;
        do {
            i = sc.nextInt();
        } while (i < 1 || i > 4);
        return i;
    }
}
