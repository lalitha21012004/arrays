import java.util.*;
public class NthLargest {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[]group={8,2,3,1,4,7,3,2};
        solve(group);
    }
    public static void solve(int[]group){
        System.out.print("enter a number:");
        int n=s.nextInt();
        Arrays.sort(group);
        int[]s1=new int[group.length];
        int x=0;
        for (int i = 0; i < group.length-1; i++) {
            if(group[i]!=group[i+1]){
             s1[x++]=group[i];
            }
        }
        s1[x++]=group[group.length-1];
        System.out.println("S1 array:"+Arrays.toString(s1));
        int[]result=new int[x];
        for (int i = 0; i < result.length; i++) {
            result[i]=s1[i];
        }
        System.out.println("Result:"+Arrays.toString(result));
        if (n>result.length) {
            System.out.println("Invalid");
        }
        System.out.println("Result:"+result[result.length-n]);
    }
}
