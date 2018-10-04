class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String word: words){
            
            map.put(word, map.getOrDefault(word, 0)+1 );
        }
    
        List<Map.Entry> list = new ArrayList(map.entrySet());
        
        Collections.sort(list, new Comparator(){
            
            public int compare(Object o1, Object o2){
                
                Integer v1 = (Integer)((Map.Entry) o1).getValue();
                Integer v2 = (Integer)((Map.Entry) o2).getValue();
                
                return v1.compareTo(v2);
            }
        });
        
        if(list.size() > k) return list.get(k).getKey();
            
        return null;

    }
}
