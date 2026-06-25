public class prefixSum1 {
   
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {1, 7, 3, 6, 5, 6}; // यहाँ अपना इनपुट बदल सकते हैं
        int ans = sol.pivotIndex(nums);
        
        System.out.println("Pivot Index is: " + ans); // आउटपुट प्रिंट करने के लिए
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, left = 0;
        for (int num : nums) total += num;
        
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i; 
            left += nums[i];
        }
        return -1; 
    }
}