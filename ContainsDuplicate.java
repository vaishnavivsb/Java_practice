import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
     public static boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(hasDuplicate(nums));
    }
}
