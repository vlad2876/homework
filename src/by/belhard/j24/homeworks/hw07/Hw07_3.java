package by.belhard.j24.homeworks.hw07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hw07_3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        boolean isOK;

        for (int i = 0; i < 10; i++)
        {
            do {
                isOK = set.add(random.nextInt(29));
            } while (!isOK);

        }
        System.out.println(set);
    }
}
