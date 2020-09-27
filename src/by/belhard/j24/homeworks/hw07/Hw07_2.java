package by.belhard.j24.homeworks.hw07;

import java.util.Arrays;
import java.util.List;

public class Hw07_2 {
    private static final int STRING_BORDER_LENGTH = 5;

    public static void main(String[] args) {

        List<String> list = Arrays.asList("erwr", "455252", "234", "fgfhhg",
                "dfgd", "f", "vfv", "jyy");
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            if (s.length() < 5)
                sb.append(s).append(" ");
        }
        System.out.println(sb);

    }
}
