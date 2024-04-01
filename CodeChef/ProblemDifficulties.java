package CodeChef;

import java.util.*;

public class ProblemDifficulties {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Set<Integer> set = new HashSet<Integer>();
            int a[] = new int[4];
            for(int i=0;i<4;i++){
                int n = sc.nextInt();
                a[i] = n;
                set.add(n);
            }
            int l = set.size();
            if(l==4 || l==3){
                System.out.println(2);
            }
            else if(l==2){
                Arrays.sort(a);
                if(a[0]==a[1]&&a[2]==a[3])System.out.println(2);
                else System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
