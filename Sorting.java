import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[]one={90,80,40,50,20,10};
        System.out.print("Unsorted Array:"+Arrays.toString(one));
        solve(one);
        System.out.print("\n Sorted Array:"+Arrays.toString(one));
    }
    public static void solve(int[]one){
        for (int j = 0; j < one.length-1; j++) {
        for (int i = 0; i < one.length-1; i++) {
            if(one[i]>one[i+1]){
                int temp=one[i];
                one[i]=one[i+1];
                one[i+1]=temp;
            }
            
        }
    }
}
}
