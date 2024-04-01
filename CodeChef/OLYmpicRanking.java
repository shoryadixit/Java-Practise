package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OLYmpicRanking {
    static int biggerTh(int a, int b) {
        if (a > b) {
            return 1;
        } else {
            return 2;
        }
    }

    static int after3(String[] arr) {
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[3 + i]);
        }
        return Arrays.stream(arr1).sum();
    }

    static int before3(String[] arr) {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        return Arrays.stream(arr1).sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            String[] s1 = br.readLine().trim().split(" ");
            int team1 = before3(s1);
            int team2 = after3(s1);
            System.out.println(biggerTh(team1, team2));
            System.out.println(team2);
        }
    }
}
