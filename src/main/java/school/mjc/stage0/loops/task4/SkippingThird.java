package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int counter = 1;
        for (int i = 1; i <= lastPrinted; i++) {
            if (counter != 3) {
                System.out.println(i);
                counter++;
            } else {
                counter = 1;
            }
        }
    }
}
