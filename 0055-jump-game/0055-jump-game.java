class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0, maxIndex=0;

        while(i<n){

    if(i>maxIndex)
        return false;


    maxIndex = Math.max(maxIndex,i+nums[i]);
    i++;
}      
return true;  
    }
}