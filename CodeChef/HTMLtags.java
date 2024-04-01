package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HTMLtags {
    static void checkHTMLTag(String a){
        char[] ar = a.toCharArray();
        int count = 0;
        for (int i = 2; i < ar.length - 2; i++) {
            if ((ar[0] == '<') || (ar[1] == '/') && (ar[ar.length - 1] == '>')) {
                if (Character.isLowerCase(ar[i])) {
                    count = count + 1;
                }
            } else {
                System.out.println("No");
                break;
            }
        }
        System.out.println(count);
        if (count == (ar.length - 3)){
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s1 = br.readLine().trim();
            System.out.println(s1);
            checkHTMLTag(s1);
        }
    }
}
