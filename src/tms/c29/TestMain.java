package tms.c29;

public class TestMain {
    public static void main(String... args) {
        byte myByte = 127;

        short myShort = 1000;

        char myCharNum = 33;
        char myCharSym = 'K';
        char myCharUTF8 = '\uf000';

        System.out.println(myCharNum);
        System.out.println(myCharSym);
        System.out.println("myCharUTF8=" + (int) myCharUTF8);
        System.out.println(myCharUTF8);

        System.out.println(myCharNum + myShort);
        System.out.println(myCharUTF8 + myShort);

        int myInt = 0;

        long myLong = 9223372036854775807L;

        double myDouble = 12.0;
        float myFloat = 13.0f;

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hello World";

        // -510+256...
        System.out.println(("byte = " + (byte) -510));

        int[] ints = new int[] {1, 2, 3};
    }
}
