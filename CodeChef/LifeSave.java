package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LifeSave {
    public String life(int a, int b, int c, int d) {
        String s1;
        int z = c / 2;
        if ((a * (b + z)) <= d) {
            s1 = "yes";
        } else {
            s1 = "no";
        }
        return s1.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(b1.readLine());
        while (t >= 1) {

            LifeSave l1 = new LifeSave();
            t--;
        }
    }
}