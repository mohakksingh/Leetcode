class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int y=target-nums[i];
            if(map.containsKey(y))
                return new int[]{i,map.get(y)};
            map.put(x,i);
        }
        return new int[]{-1,-1};
    }
}