package HackerRank.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SparseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine().trim());
        String[] string = new String[size];
        for (int i = 0; i < size; i++) {
            string[i] = br.readLine();
        }
        //System.out.println(Arrays.toString(string));
        int queries = Integer.parseInt(br.readLine().trim());
        int[] query = new int[queries];
        for (int i = 0; i < queries; i++) {
            String[] a = new String[queries];
            a[i] = br.readLine();
            int count = 0;
            for (int j = 0; j < string.length; j++) {
                if (string[j].equals(a[i])) {
                    count += 1;
                    //System.out.println(string[i] + ", " + a);
                }
                query[i] = count;
            }
        }
        for (int i = 0; i < query.length; i++) {
            System.out.print(query[i] + " ");
        }
    }
}
