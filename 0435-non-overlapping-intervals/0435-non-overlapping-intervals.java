class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int count=0;
        int endingTime = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(endingTime > intervals[i][0])
            count++;
            else 
            endingTime=intervals[i][1];
        }
        return count;
    }
}