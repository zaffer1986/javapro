package HomeWork2.Task3a;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] number = {22, 2, 36, 1, 0, -5, -2, -1, 99, 65, 24};
        //vivod massiva
        System.out.println(Arrays.toString(number));
        //sortirovat massiv
        int[] number1 = new int[number.length];
        System.arraycopy(number, 0, number1, 0, number.length);
        Arrays.sort(number1);
        System.out.println(Arrays.toString(number1));
        //Chetni chislo massiva
        System.out.println("Even number of Arrays:");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }
        System.out.println("Odd number of Arrays:");
        //Nechetni chilo massiva
        for (int j = 0; j < number.length; j++) {
            if (number[j] % 2 != 0) {
                System.out.println(number[j]);
            }
        }
        System.out.println("Index of Array");
        int elementSearch = -2;
        System.out.println(Array.searchIndexArray(number, elementSearch));


        }

    public static int searchIndexArray(int[] ArraySearch, int elementSearch) {
        int index = -1;
        for (int S = 0; S < ArraySearch.length; S++) {
            if (elementSearch == ArraySearch[S]) {
                index = S;
                break;
            }
        }
        return index;

    }
}





