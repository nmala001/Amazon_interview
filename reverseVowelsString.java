class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Character> vowList = new ArrayList<Character>();
        vowList.add('a');
        vowList.add('e');
        vowList.add('i');
        vowList.add('o');
        vowList.add('u');
        vowList.add('A');
        vowList.add('E');
        vowList.add('I');
        vowList.add('O');
        vowList.add('U');
        
        char[] c = s.toCharArray();
        String res = "";
        int i= 0;
        int j= s.length()-1;
        
        
        while(i<j){
            if(!vowList.contains(c[i])){
                i++;
                continue;
            }
            if(!vowList.contains(c[j])){
                j--;
                continue;
            }
            
            char fin = c[i];
            c[i] = c[j];
            c[j] = fin;
            
            i++;
            j--;
        }
        
        
        return new String(c);
        
    }
}
