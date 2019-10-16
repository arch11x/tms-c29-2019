package tms.c29;

import java.util.Arrays;

public class TestMain {
    public static void main (String[] args)
    {
        /*При помощи двумерного массива вывести на экран таблицу умножения*/
        // int[][] array = new int[9][9];
        int [] [] array = {{1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9}};//объявление двумерного массива
        int multiplication;//объявление переменной для умножения
        System.out.println("Таблица умножения: ");
        for (int i =0; i < array.length; i++)
        {
            for (int j =0; j< array.length; j++)
            {
                multiplication = array[i][j] * array [j][i];//вычисление произведения
                System.out.println(array[i][j] + " " + array[j][i] + " "+ multiplication);//вывод
            }
        }
    }

}
