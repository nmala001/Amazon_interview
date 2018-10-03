class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int i = 0;
        int j = 0;
        Set<Character> arr = new HashSet<>();
        while(s.length()>i){
            if(!arr.contains(s.charAt(i))){
                
                arr.add(s.charAt(i++));
                len = Math.max(len, arr.size());
            }else{
                arr.remove(s.charAt(j++));
            }
        }
        return len;
    }
}
