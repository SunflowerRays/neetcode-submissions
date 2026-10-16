class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 1; j < nums.length; j++){
                if(i==j) continue;
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
