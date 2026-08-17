class Solution {
    public int maxProduct(int[] nums) {
        int currentmin= nums[0];
        int currentmax = nums[0];
        int maxproduct = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = currentmax;

            currentmax=Math.max(nums[i],
                       Math.max(nums[i]*currentmax,
                                nums[i]*currentmin));

            currentmin= Math.min(nums[i],
                        Math.min(nums[i]*temp,
                                 nums[i]*currentmin));

            maxproduct = Math.max(maxproduct,currentmax);                                        
        }
        return maxproduct;
        
    }
}