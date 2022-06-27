package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0;
        int sum = 0;
        if (numberToSkip > lastInRow)
            System.out.println("number to skip is bugger then the last");
        else if (lastInRow < 0)
            System.out.println("last number in row is negative");
        else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i <= numberToSkip)
                    skippedSum += i;
                else
                    sum += i;
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + sum);
        }
    }
}
