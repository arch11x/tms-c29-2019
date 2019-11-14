package tms.c29;

import org.w3c.dom.ls.LSOutput;
import tms.c29.lec_8.classwork.point_4.MyCustomException;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.function.Function;

public class TestMain {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) throws MyCustomException {
        Function<String, Integer> parse = string -> {
            System.out.println("string = " + string);
            return Integer.parseInt(string);
        };
        Function<Integer, String> plus = number -> {
            System.out.println(number+10);
            return String.valueOf(number + 10);
        };

        Function<Integer, Integer> compose = parse.compose(plus);

        Function<Integer, String> andThen = String::valueOf;

        parse.andThen(andThen);

        Integer apply = compose.apply(1);
        System.out.println(apply);


    }
}
