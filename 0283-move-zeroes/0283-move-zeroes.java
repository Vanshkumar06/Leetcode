class Solution {
    public void moveZeroes(int[] nums) {
        int j =0;
        int zerocount=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zerocount++;
            }else{
                nums[j]=nums[i];
                j++;
            }
        }
        while(zerocount>0){
            nums[j]=0; 
            j++;
            zerocount--;
        }
        
    }
}