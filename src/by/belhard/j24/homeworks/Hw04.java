package by.belhard.j24.homeworks;

public class Hw04 {
    public static void main(String[] args) {
        //1
        int[] arr = {14, 23, 62, 24, 69, 73, 21, 54, 82, 43};
        int sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }

        double average = (double) sum / arr.length;
        System.out.println("Сумма чисел в массиве равна - " + sum);
        System.out.println("Среднее значение чисел в массиве равна - " + average);
        System.out.println();

        //2

        int[][] arr3 = {{0}, {0, 0}, {0, 0, 0}};
        int start = 5;


        //3;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Доп
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Доп2

        for (int i = 10; i <= 19; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 30; i <= 39; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 50; i <= 59; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 70; i <= 79; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 90; i <= 99; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                System.out.print(i + " ");
        }

    }
}
