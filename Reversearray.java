import java.util.Arrays;
public class Reversearray{
  public static void main(String[]args){
    int[]box={1,2,3,4,5};
    System.out.println(Arrays.toString(box));
    solve(box);
    System.out.println(Arrays.toString(box));
  }
  public static void solve(int box[]){
    int left=0,right=box.length-1;
    while(left<right){
      temp=box[left]
      box[left]=box[right]
      box[right]=temp;
      left++;
      right--;
    }
  }
}
    
