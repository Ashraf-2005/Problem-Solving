class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int maxfreq = 0;
        int ans = -1;
        for(int n : nums){
            if(n%2 == 0){
                count = map.getOrDefault(n,0)+1;
                map.put(n,count);
            
            if(count > maxfreq){
                maxfreq = count;
                ans = n;
            }
            else if(maxfreq == count && n<ans){
                ans = n;
            }
        }
        }
        return ans;
    }
}