package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main(String... args) {
        int[] ints = {2, 3, 0, 1, 6, 6, 6, 6, 6, 6, 6, 6};

        int iterCounter = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < ints.length - i; j++) {
                iterCounter++;
                if (ints[j] < ints[j - 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j - 1];
                    ints[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("counter: " + iterCounter);

        ints = new int[]{2, 3, 0, 1};

        iterCounter = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < ints.length; i++) {
                iterCounter++;
                if (ints[i] < ints[i - 1]) {
                    int temp = ints[i];
                    ints[i] = ints[i - 1];
                    ints[i - 1] = temp;

                    needIteration = true;
                }
            }
        }

        System.out.println(Arrays.toString(ints));
        System.out.println("counter: " + iterCounter);

    }
}
