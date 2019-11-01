package tms.c29;

import tms.c29.lec_8.classwork.point_4.MyCustomException;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) throws MyCustomException {
        Boolean flag = true; // я думаю здесь можно обойтись примитивом boolean
        while (flag) {
            System.out.println("Please enter array dimension: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            try {
                // я бы предложил тебе проверку числа вынести в отдельный метод из которого выбрасывать исключение и затем создавать массив в main()
                if (size > 0 && size < 10) {
                    int[] array = new int[size];
                    for (int i = 0; i < size; i++) {
                        array[i] = (int) (Math.random() * 10);
                    }
                    System.out.println(Arrays.toString(array));
                } else {
                    throw new IndexOutOfBoundsException("Error in array dimension");
                }
                flag=false;
            } catch (IndexOutOfBoundsException e) {
//                throw new MyCustomException("Error in array dimension");
            }
            System.out.println("sex");
        }
    }//я не разобралась,что мне надо добавить,чтобы после Exception просило ввести еще раз.
}
