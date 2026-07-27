class Solution {
    public int maxProduct(int n) {
        int fmax = 0;
        int smax = 0;
        int maxp = 0;
       while(n>0){
        int val = n%10;
        if(val >= fmax){
            smax = fmax;
            fmax = val;
            
        }
        else{
            smax = val;
        }

        if(fmax*smax > maxp){
            maxp = fmax*smax;
        }
        n = n/10;
       }
       return maxp;
    }
}