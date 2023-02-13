import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] arrayTwoo = {1.57, 7.654, 9.986};
        int[] arrayThree = {5, 8, 63, 46, 86, 563};
    }



    public static void task2() {
        System.out.println("Задача 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.print(array[0] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[2]);
        System.out.println("");
        double[] arrayTwoo = {1.57, 7.654, 9.986};
        System.out.print(arrayTwoo[0] + ", ");
        System.out.print(arrayTwoo[1] + ", ");
        System.out.print(arrayTwoo[2]);
        System.out.println("");
        int[] arrayThree = {5, 8, 63, 46, 86, 563};
        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayThree.length - 1) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.print(arrayThree[i]);
            }
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.print(array[2] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[0]);
        System.out.println("");
        double[] arrayTwoo = {1.57, 7.654, 9.986};
        System.out.print(arrayTwoo[2] + ", ");
        System.out.print(arrayTwoo[1] + ", ");
        System.out.print(arrayTwoo[0]);
        System.out.println("");
        int[] arrayThree = {5, 8, 63, 46, 86, 563};
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.print(arrayThree[i]);
            }
        }
        System.out.println("");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] %2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}