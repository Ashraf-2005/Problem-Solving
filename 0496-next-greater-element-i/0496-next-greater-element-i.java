class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
             int target = nums1[i];
             boolean ftar= false;
             int val = -1;
            for(int j=0; j<nums2.length; j++){
                if(target == nums2[j]){
                    ftar = true;
                }
                if(ftar && nums2[j]>target){
                   val = nums2[j] ;
                   break;
                }
            }
            ans[i] = val;
        }
        return ans;
    }
}