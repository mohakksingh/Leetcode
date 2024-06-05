class Solution {
    public List<String> commonChars(String[] A) {
        List<String> charArr = new ArrayList<>();
        int[][] lowerCase = new int[26][A.length];
        for(int i = 0 ; i< A.length ; i++){
            for(int j =0; j<A[i].length();j++)
            lowerCase[A[i].charAt(j)-'a'][i] ++;            
        }
        for(int i =0; i < 26 ;i++){
            int min = lowerCase[i][0];
            for(int j = 0 ; j< A.length ; j++){
                if(lowerCase[i][j]<min)
                    min = lowerCase[i][j];
            }
            while(min!=0){
                charArr.add(Character.toString((char)(i+'a')));
                min--;

            }
        }
        return charArr;
    }
}