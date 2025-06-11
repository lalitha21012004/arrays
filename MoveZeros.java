import java.util.Arrays;

public class MoveZeros {

    public static void solve(int[] n) {
        int l = 0, r = n.length - 1;
        while (l < r) {
            if (n[l] == 1) {
                l++;
            } else if (n[r] == 0) {
                r--;
            } else {
                int temp = n[l];
                n[l] = n[r];
                n[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] n = { 1, 0, 1, 1, 0, 1, 1, 0 };
        System.out.println(Arrays.toString(n));
        solve(n);
        System.out.println(Arrays.toString(n));
    }
}