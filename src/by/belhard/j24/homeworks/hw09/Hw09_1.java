package by.belhard.j24.homeworks.hw09;

import java.io.*;

public class Hw09_1 {

    private static final int CUBE_VALUE = 3;

    public static void main(String[] args) {

        String s = "";
        int a = 0;
        StringBuilder sb = new StringBuilder();

        try {
            File file = new File("1.txt");
            if (!file.exists())
                file.createNewFile();

            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                s = br.readLine();
                String[] splitted = s.split(" ");
                for (String value : splitted) {
                    a = Integer.parseInt(value);
                    int b = (int) Math.pow(a, CUBE_VALUE);
                    sb.append(b).append(" ");
                }
                System.out.println(sb);
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            File file1 = new File("2.txt");
            if (!file1.exists())
                file1.createNewFile();

            BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
            bw.write(sb.toString());
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
