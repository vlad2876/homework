package by.belhard.j24.homeworks;

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

int r = 12;
double p = 3.1415;
        System.out.println("Площадь " + ((r * r) * p));
        System.out.println("Длина " + ((2 * p) * r));

        System.out.println();
        System.out.println("Задание 3");

        // Задание 3

int temp = 24;
        {
            String odejda = temp > 30 ? "Я бы дома остался в такую жару" : (temp > 20 ? "Маечка, шортики и погнал" : temp > 15 ? "Худи по-тоньше" : temp > 10 ? "Можно расстегнуть куртку" : temp >= 0 ? "Онли куртка" : null);

            System.out.println(odejda);
        }

        System.out.println();
        System.out.println("Задание 4");

        // Задание 4

int zp1 = 964, zp2 = 341, zp3 = 582;
        System.out.print("Разница межнду самой высокой и маленькой зарплатой " + (zp1 - zp2) + ("р"));

        System.out.println();
        System.out.println();
        System.out.println("Задание 5");


/* Задание 5 (Незнаю можно ли так, но это Math.pow в интернете нашел, просто так можно
переменные менять на любые числа, а сам пока могу только два каких-то конкретных числа попробовать
возвести в степень. Если не катит, могу переделать сам вобщем)
 */

        int z = 4;
        int x = 3;
        System.out.println("Число z в степени x равно " + Math.pow(z, x));

        System.out.println();
        System.out.println("Задание 6");

        // Задание 6

double startSum = 500;
int years = 6;
        double proc;



            for (int n = 1; n <= years; n++){
                startSum = (startSum - ((startSum * 1) / 100));
                proc = startSum * 4 / 100;
                startSum = startSum + proc;

            }
        double newSum = startSum;
        System.out.println(newSum);



    }


}
