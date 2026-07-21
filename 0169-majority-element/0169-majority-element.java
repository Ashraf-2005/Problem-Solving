class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            int count = map.getOrDefault(n,0)+1;
            map.put(n,count);

            if(count > nums.length/2){
                 return n;
            }
        }
        return -1;
    }
}