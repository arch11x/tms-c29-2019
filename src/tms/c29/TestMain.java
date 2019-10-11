package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int a=4;
        for(int i=1; i<=a;i++){
            for(int k=1; k<=a; k++){
                if(k<=a-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int b=1; b<=a;b++){
            for(int c=1; c<=a; c++){
                if(c>=b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int d=1; d<=a;d++){
            for(int e=1; e<=a; e++){
                if(e<=d)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int f=1; f<=a;f++){
            for(int g=1; g<=a; g++){
                if(f<=a-g+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
