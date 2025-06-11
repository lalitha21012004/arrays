import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int[] z = {8, 3, 2, 8, 2, 2, 8, 3};
        System.out.println(Arrays.toString(z));
        int[] res = solve(z);
        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] z) {
        Arrays.sort(z);
        int b[] = new int[z.length];
        int x = 0;

        for (int i = 0; i < z.length - 1; i++) { // Changed condition to avoid ArrayIndexOutOfBoundsException
            if (z[i] != z[i + 1]) {
                b[x++] = z[i];
            }
        }
        b[x++] = z[z.length - 1]; // Ensure the last element is added

        int res[] = new int[x]; // Create result array of size x
        for (int i = 0; i < x; i++) { // Copy elements from b to res
            res[i] = b[i];
        }
        return res;
    }
}
