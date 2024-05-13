class Solution {
    public List<List<Integer>> finalAns=new ArrayList<>();
    public void helper(int[] nums,int index,List<Integer> combinationsFormedSoFar){
        //base case
        if(index==nums.length){
            finalAns.add(new ArrayList<>(combinationsFormedSoFar));
            return;
        }
        
        //do not pick the current element
        helper(nums,index+1,combinationsFormedSoFar);
        
        //pick the current element
        combinationsFormedSoFar.add(nums[index]);
        helper(nums,index+1,combinationsFormedSoFar);
        combinationsFormedSoFar.remove(combinationsFormedSoFar.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return finalAns;
    }
}