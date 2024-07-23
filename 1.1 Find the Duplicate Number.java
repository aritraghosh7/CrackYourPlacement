class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        while (count<nums.length-1){
            if (nums[count]==nums[count+1]){
                return nums[count];
            }
            count++;
        }
        return nums[count];
    }
}
