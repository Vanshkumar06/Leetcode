class Solution {
    public String smallestGoodBase(String n) {
        
        long num = Long.parseLong(n);
        for(int m =63;m>=2;m--){
            long k =(long)Math.pow(num, 1.0/m);

            if(k<2)continue;

            long sum =1;
            long power = 1;
            for(int i =0;i<m;i++){
                if(power>(num-1)/k){
                    sum = num +1;
                    break;
                }
                power *= k;
                sum += power;


                if(sum>num)break;
            }
            if(sum == num)
            return String.valueOf(k);
        }
        return String.valueOf(num-1);
        
    }
}
