class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int windowSum=0;
        int min_length = Integer.MAX_VALUE;
        

        while(right < nums.length){
            windowSum += nums[right];
            

            while(windowSum >= target){
                min_length = Math.min(min_length, right - left +1);
                windowSum -= nums[left];
                left++;

            }
            right++;
        }
        return min_length == Integer.MAX_VALUE ? 0 :min_length;
        
        
    }
}