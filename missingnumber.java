package arrays;

import java.util.Arrays;

public class missingnumber {
    public static void solve(int[] a) {
        for (int i = 0, j = 1; i < a.length; i++, j++) {
            if (j != a[i]) {
                System.out.println(j);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 7 };
        System.out.println("a:" + Arrays.toString(a));
        solve(a);
    }
}
