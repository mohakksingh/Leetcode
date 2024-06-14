class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int counter=0;
        
        for(int i=1;i<nums.length;i++){
                if(nums[i] <=nums[i-1]){
                   counter +=1 + nums[i-1] - nums[i];
                    nums[i]=nums[i-1]+1;
            }
        }
        
        return counter;
    }
}