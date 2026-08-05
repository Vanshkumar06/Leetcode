class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas =0, totalCost=0;
        for(int g : gas ) totalGas +=g;
        for(int c : cost )totalCost +=c;
        if(totalGas < totalCost) return -1;
        int totalFuel =0, startingIndex=0;
        for(int i =0;i<gas.length;i++){
            totalFuel +=gas[i] - cost[i];

            if(totalFuel <0){
                startingIndex=i+1;
                totalFuel=0;
            }
        }
        return startingIndex;
        
    }
}