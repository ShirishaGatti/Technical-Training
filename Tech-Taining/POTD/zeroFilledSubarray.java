package POTD;
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i=0,j=0;
        long len=0;
        while(j<nums.length){
            if(nums[j]==0){
                len+=(j-i+1);
                j++;
            }
            else{
                i=j+1;
                j++;
            }
        }
        return len;
    }
}