class Solution {
    public int romanToInt(String s) {

       int sum = 0;
       char[] arr = s.toCharArray();
        sum += getvalue(arr[arr.length-1]);
       for(int i= arr.length-2; i>=0; i--){
        int ct = getvalue(arr[i]);
          if(ct>=getvalue(arr[i+1])){
            sum += ct;
          }
          else{
            sum -= ct;
          }
          
       } 
       return sum;
    }
    public int getvalue(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
}