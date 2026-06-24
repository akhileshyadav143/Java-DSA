import java.util.Arrays;

public class PrefixSum {

    // 1. Changed return type from void to int[], and added int[] nums as a parameter
    public static int[] calculatePrefixSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0]; // Handle empty arrays safely
        }
        
        int n = nums.length;
        int[] p = new int[n];

        
        p[0] = nums[0];
        
        int i = 1;

        while (i < n) {
            p[i] = p[i - 1] + nums[i];
            i++; // 
        }

        return p; 
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 3, 5, 6, 7}; 
        
        
        int[] result = calculatePrefixSum(nums); 
        
      
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Prefix Sum:     " + Arrays.toString(result));
    }
}

    

    
