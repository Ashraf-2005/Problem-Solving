class Solution {
    public int maximumProduct(int[] nums) {
    int maxp = 0;
    Arrays.sort(nums);
    /*for(int i=0; i<nums.length; i++){
        for(int j=2; j<nums.length; j++){
            if(i != j && j != j-1 && j-1 != i){
                int val = nums[i] * nums[j] * nums[j-1];
                maxp = Math.max(val, maxp);
            }
               
        }
    }*/
    int n = nums.length;
        int val1 = nums[n-1]*nums[n-2]*nums[n-3];
        int val2 = nums[0]*nums[1]*nums[n-1];
         maxp = Math.max(val1,val2);
    
    return maxp;
    }
}