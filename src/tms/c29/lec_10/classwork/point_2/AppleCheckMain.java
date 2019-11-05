package tms.c29.lec_10.classwork.point_2;

import java.util.Arrays;

public class AppleCheckMain {
    public static void main(String[] args) {
        String apple = "RED";

        Apple[] values = Apple.values();
        System.out.println(Arrays.toString(values));

        Apple enumApple = Apple.valueOf(apple);
        System.out.println(enumApple);

        switch (enumApple) {
            case RED:
                System.out.println("This is red apple");
                break;
            case GREEN:
                System.out.println("This is green apple");
                break;
        }

        System.out.println(enumApple == Apple.RED);
        System.out.println(enumApple + " " + enumApple.getKg());

        System.out.println(enumApple.toPounds());

    }
}
