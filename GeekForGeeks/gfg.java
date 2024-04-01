package GeekForGeeks;// { Driver Code Starts
import java.lang.*;
import java.io.*;

class gfg
{

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");

            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);

            int arr[] = new int[N];

            String st[] = read.readLine().trim().split("\\s+");

            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }

            Solution1 obj = new Solution1();

            System.out.println(obj.ternarySearch(arr, N, K));
        }
    }
}// } Driver Code Ends


class Solution1{
    static int ternarySearch(int[] arr, int key, int start, int end){
        if (start > end)
            return -1;
        int mid1 = start + (end - start) / 3;
        int mid2 = start + 2 * (end - start) / 3;

        if (arr[mid1] == key)
            return 1;
        else if (arr[mid2] == key)
            return 1;
        else if (key < arr[mid1])
            return ternarySearch(arr, key, start, mid1-1);
        else if (key > arr[mid2])
            return ternarySearch(arr, key, mid2+1, end);
        else
            return ternarySearch(arr, key, mid1, mid2);

    }

    static int ternarySearch(int[] arr, int N, int K)
    {
        return ternarySearch(arr, K, 0, N-1);
    }
}