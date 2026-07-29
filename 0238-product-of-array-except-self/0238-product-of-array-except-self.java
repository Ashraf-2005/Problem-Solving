class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
       int[] arrL = new int[n];
       arrL[0] = 1;
       for(int i=1; i<n; i++){
        arrL[i] = nums[i-1] * arrL[i-1];
       }
       System.out.println(Arrays.toString(arrL));
       int[] arrR = new int[n];
       arrR[n-1] = 1;
       for(int i=n-2; i>=0; i--){
        arrR[i] = nums[i+1]*arrR[i+1];
       }
       System.out.println(Arrays.toString(arrR));
       int[] ans = new int[n];
       for(int i=0; i<n; i++){
        ans[i] = arrL[i] * arrR[i];
       }
       return ans;
    }
}