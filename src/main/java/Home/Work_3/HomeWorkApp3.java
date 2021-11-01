package Home.Work_3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] mainarr = {3, 3, 2, 2, 5, 5};
        replacingZerosArray();
        fillingArray();
        multiplicationCells();
        squareArrayWithUnits();
        returningArray(4,5);
        maximumMinimumElementArray();
        CheckBalance();
        arrayOffset(mainarr,2);

    }

    //№1
    public static void replacingZerosArray() {
        int[] arr = {1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i <= 9; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //№2
    public static void fillingArray() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
    }

    //№3
    public static void multiplicationCells() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    //№4
    public static void squareArrayWithUnits() {
        int table[][] = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                if (j == i || j == table.length - 1 - i) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    //№5
    public static int[] returningArray(int len, int initialValue) {
        int[] arr4 = new int[len];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = initialValue;
            System.out.print(" " + arr4[i]);
        }
        return arr4;
    }

    //№6
    public static void maximumMinimumElementArray() {
        int[] arr5 = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = rand.nextInt();

        }
        int max = getMax(arr5);
        System.out.println("Maximum Value is: " + max);
        int min = getMin(arr5);
        System.out.println("Minimum Value is: " + min);
        System.out.println(Arrays.toString(arr5));
    }

    public static int getMax(int[] inputArray) {//  находим максимум
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {//  находим минимум
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    //№7
    static boolean CheckBalance() {
        int[] mainarr = {3, 3, 2, 2, 5, 5};
        int leftSum = 0;
        int rightSum = 0;
        int n = mainarr.length - 1;
        for (int i = 0; i < n; i++) {
            leftSum += mainarr[i];
        }
        rightSum += mainarr[n];
        for (; ; ) {
            if (leftSum != rightSum && n > 0) {
                rightSum += mainarr[n];
                n--;
                leftSum = 0;
                for (int i = 0; i < n; i++) {
                    leftSum += mainarr[i];
                }
            } else break;
        }
        return (rightSum == leftSum);
    }

    //№8
    public static void arrayOffset(int mainarr[],int offset) {
        if (offset <= 0) {
            for (int i = 0; i < Math.abs(offset); i++) {
                int temp = mainarr[0];
                for (int j = 0; j < mainarr.length - 1; j++) {
                    mainarr [j] =  mainarr [j + 1];
                }
                mainarr [ mainarr.length - 1] = temp;

            }
                }
                else {
            for (int i = 0;i < Math.abs(offset); i++){
                int temp =  mainarr[mainarr.length- 1];
                for (int j = mainarr.length - 1; j > 0; j--){
                    mainarr [j] =  mainarr [j - 1];
                     }
                mainarr [0] = temp;
                }
            }

    }

}



