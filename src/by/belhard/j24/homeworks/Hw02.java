package by.belhard.j24.homeworks;

import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание 1");

// Задание 1

        int a = 248, b = 31;
        boolean a1 = true, b1 = false;
        System.out.println(((a / b + 2) * 5) % 20);
        System.out.println(a != b);
        System.out.println(!a1 || b1);

        System.out.println();
        System.out.println("Задание 2");

        // Задание 2
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double p = 3.1415;
        System.out.println("Площадь " + ((r * r) * p));
        System.out.println("Длина " + ((2 * p) * r));

        System.out.println();
        System.out.println("Задание 3");

        // Задание 3

        int temp = 23;
        {
            String odejda = temp > 30 ? "Я бы дома остался в такую жару" : (temp > 20 ? "Маечка, шортики и погнал" : temp > 15 ? "Худи по-тоньше" : temp > 10 ? "Можно расстегнуть куртку" : temp >= 0 ? "Онли куртка" : null);

            System.out.println(odejda);
        }

        System.out.println();
        System.out.println("Задание 4");

        // Задание 4

        int zp1 = 964, zp2 = 341, zp3 = 582;
        System.out.print("Разница между самой высокой и маленькой зарплатой " + (zp1 - zp2) + ("р"));

        System.out.println();
        System.out.println();
        System.out.println("Задание 5");


/* Задание 5 (Незнаю можно ли так, но этот Math.pow в интернете нашел, просто так как-то проще получается.
 Если не катит, могу попробовать сам вобщем)
 */

        int z = 5;
        int x = 2;
        System.out.println("Число z в степени x равно " + Math.pow(z, x));

        System.out.println();
        System.out.println("Задание 6");

        // Задание 6

        double startSum = 500;
        int years = 5;
        double proc;


        for (int n = 1; n <= years; n++) {
            startSum = (startSum - ((startSum * 1) / 100));
            proc = startSum * 3 / 100;
            startSum = startSum + proc;

        }
        double newSum = startSum;
        System.out.println(newSum);



    }


}
