class TwoSum {
//       Test Case:

//     Input: nums = [2,7,11,15], target = 9
//     Output: [0,1]
//     Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    
  public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2] ;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        return ans;
    }
}
