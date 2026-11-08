package Practice;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

interface HasWings {
    public int getNumberOfWings();
}

abstract class Insect implements HasWings {
    abstract int getNumberOfLegs();
}

public class DragonFly extends Insect {
    @Override
    public int getNumberOfWings() {
        return 4;
    }

    @Override
    int getNumberOfLegs() {
        return 6;
    }
}
