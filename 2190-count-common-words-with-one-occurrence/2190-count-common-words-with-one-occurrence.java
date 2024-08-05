class Solution {
    public int countWords(String[] words1, String[] words2) {
        int result=0;

        Map<String,Integer> map1=countOccurences(words1);
        Map<String,Integer> map2=countOccurences(words2);

        for(String word:words1){
            if(map1.getOrDefault(word,0)==1 && map2.getOrDefault(word,0)==1){
                result++;
            }
        }
        return result;
    }

    private Map<String,Integer> countOccurences(String[] words){
        Map<String,Integer> map=new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0)+1);   
        }

        return map;
    } 
}