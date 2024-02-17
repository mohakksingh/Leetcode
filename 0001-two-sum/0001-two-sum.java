class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int a=nums[i];
            int more=target-a;
            if(mpp.containsKey(more)){
                return new int[]{mpp.get(more),i};
            }
            mpp.put(a,i);
        }
        return new int[] {-1,-1};
    }
}