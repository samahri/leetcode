class Solution {
    /*
    * T = O(n^2)
    * S = O(1)
    */
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int i = 1;
        
        while (i < l) {
            if (nums[i] == nums[i-1]) {
                shiftArray(nums, i, l);
                l--;
            } else {
                i++;
            }
        }
        
        return l;
    }
    
    private void shiftArray(int[] num, int from, int to) {
        for (int j = from + 1; j < to; j++) {
            num[j-1] = num[j];
        }
    }
}