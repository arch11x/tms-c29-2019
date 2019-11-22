package tms.c29;

import tms.c29.lec_12.classwork.part_3.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestMain {
    public static void main(String[] args) {
        String pattern = "([APE])(.*)";
        Predicate<String> filter = name -> name.matches(pattern);

        UnaryOperator<List<User>> userFilter = list -> {
            list.removeIf(nextUser -> filter.test(nextUser.getName()));
            return list;
        };

        var userList = new ArrayList<User>();
        userList.add(new User("Ann"));
        userList.add(new User("Alolo"));
        userList.add(new User("Aenda"));
        userList.add(new User("John"));
        userList.add(new User("Peppa"));
        userList.add(new User("Elizabeths"));

        userList.removeIf(user -> user.getName().startsWith("A"));

        System.out.println(userList);

        var ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(1);
        show(ints);


        String s = new String(" AA ");
        String strip = s.strip();
        System.out.println(s.stripTrailing().length());
        System.out.println(s.trim().length());
        System.out.println(s.repeat(10));
    }

    private static void show(List<Integer> integerList) {
        System.out.println(integerList);
    }
}