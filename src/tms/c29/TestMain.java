package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10};
        recursionOutput(array, 0);

        System.out.println(String.class.getTypeName());
    }

    // думаю этот метод может быть void,
    private static int recursionOutput(int[] array, int index) {
        System.out.print(array[index] + "\t");
        index++;
        if (index < array.length) {
            index = recursionOutput(array, index);
        }
        return index;
    }

}
