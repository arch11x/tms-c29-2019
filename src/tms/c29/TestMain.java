package tms.c29;

public class TestMain {
    public static void main(String[] args) {
        String text = "AAA";

        int index = 0;
        do {
            index = text.indexOf("A", index + 1);
            System.out.println(index);
        } while (index != -1);
    }
}
