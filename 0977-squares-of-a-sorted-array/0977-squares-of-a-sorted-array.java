import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int head = 0;
        int tail = nums.length-1;
        for(int position = nums.length-1; position >= 0; position--){
            if(nums[head] > nums[tail]){
                result[position] = nums[head];
                head++;
            }else{
                result[position] = nums[tail];
                tail--;

            }
        }
     return result;
    }
}