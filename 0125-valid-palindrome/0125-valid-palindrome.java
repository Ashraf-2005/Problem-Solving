class Solution {
    public boolean isPalindrome(String s) {
        String n = s.toLowerCase();
      n =  n.replaceAll("[^a-z0-9]", "");
      int l=0;
      int r = n.length()-1;
      while(l<r){
        if(n.charAt(l) != n.charAt(r)){
            return false;
        }
        l++;
        r--;
      } 
      return true; 
    }
}