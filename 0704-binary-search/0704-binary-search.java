class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            //find the middle element
            int mid=start+(end-start)/2;//might extend the range of int in java
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}