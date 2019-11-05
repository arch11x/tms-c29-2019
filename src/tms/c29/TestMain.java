package tms.c29;

import tms.c29.lec_8.classwork.point_4.MyCustomException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(12);
        List<? super Integer> list = integers;
        System.out.println(list);
        list.add(null);
        list.add(1);

        Object object = list.get(0);


        List<?> genericList = integers;
        genericList.add(null);
//        genericList.add(1);
        Object o = genericList.get(0);

        List<Integer> put = put(integers);
        System.out.println(put);
    }

    private static <T extends Number> List<T> put(List<T> list) {
        List<T> arr = list;

        arr.add(null);
        T t = arr.get(0);
        System.out.println(t.getClass().getName());

        return list;
    }
}
