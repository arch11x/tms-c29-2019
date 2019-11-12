package tms.c29;

import tms.c29.lec_8.classwork.point_4.MyCustomException;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TestMain {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) throws MyCustomException {
        HashSet<Object> objects = new HashSet<>();
        objects.add(null);
        objects.add(null);
        System.out.println(objects);
    }
}
