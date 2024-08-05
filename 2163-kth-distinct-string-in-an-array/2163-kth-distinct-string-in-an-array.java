class Solution {
    public String kthDistinct(String[] arr, int k) {
        int distinctCount=0;

        for(int i=0;i<arr.length;i++){
            boolean isDistinct=true;

            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i].equals(arr[j])){
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct){
                distinctCount++;
                if(distinctCount == k){
                    return arr[i];
                }
            }
        }
        return "";
    }
}