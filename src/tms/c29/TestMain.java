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

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ann"));
        userList.add(new User("Alolo"));
        userList.add(new User("Aenda"));
        userList.add(new User("John"));
        userList.add(new User("Peppa"));
        userList.add(new User("Elizabeths"));

        userList.removeIf(user -> user.getName().startsWith("A"));

        System.out.println(userList);

    }
}