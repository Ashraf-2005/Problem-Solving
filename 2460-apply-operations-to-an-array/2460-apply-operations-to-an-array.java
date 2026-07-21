class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                nums[i-1] = nums[i-1]*2;
                nums[i] = 0;
            }
        }
        int r = 0;
        for(int l=0; l<nums.length; l++){
            if(nums[l] != 0){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            r++;
            }
        }
       return nums;
    }
}