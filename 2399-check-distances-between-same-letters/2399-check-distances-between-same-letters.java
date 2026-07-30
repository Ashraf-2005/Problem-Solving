class Solution {
    public boolean checkDistances(String s, int[] dis) {
        int count = s.length()/2;
        
        for(int i=0; i<s.length(); i++){
            int ct = 0;
            char c = s.charAt(i);
            for(int j=i+1; j<s.length(); j++){
                if(c == s.charAt(j)){
                     ct = j-i-1;
                
                 if(dis[c - 'a'] != ct){
                    return false;
                 }
                }
               
            }
            
        }
        return true;
    }
}