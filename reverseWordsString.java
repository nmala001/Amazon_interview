public class Solution {
    public String reverseWords(String s) {
        
        String reverse = "";
        
        if(s == null || s.length() == 0){
            
            return "";
        }
        
        //Splitting the word by space
        String[] words = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length-1; i>=0;--i){
            if(!words[i].equals("")){
                
                sb.append(words[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length()-1);
        
        }
    }
