class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;

        for(int[]customers :accounts){
            int sum =0;
            for(int money:customers )
                sum+=money;
            max=Math.max(max,sum);
        }
        return max;

        
    }
}