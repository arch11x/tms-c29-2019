package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] ints = {2, 3, 4};

        int[] ints1 = Arrays.copyOf(ints, ints.length);
        System.out.println(Arrays.toString(ints1));

        ints1[0] = 66;

        System.out.println(Arrays.toString(ints));
    }

}
