package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    protected Random random = new Random();

    public ColorSupplier() {
        this.random = random;
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
