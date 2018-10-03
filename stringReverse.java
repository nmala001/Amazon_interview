class Solution {
    public String reverseString(String s) {
        
        char[] c = s.toCharArray();
        String res = "";
        
        for(int i=c.length -1;i>=0;i--){
            
            res= res+c[i];
            
        }
        
        return res;
        
    }
}
