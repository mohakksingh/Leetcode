class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        
        for(int i=0;i<n;i++){
            int a=numbers[i];
            for(int j=i+1;j<n;j++){
                int b=numbers[j];
                if(a+b==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[] {};
    }
}