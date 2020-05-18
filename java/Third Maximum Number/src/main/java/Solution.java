import java.util.TreeSet;

class Solution {
    /*
    * T = O(N)
    * S = O(N)
    */
    public int thirdMax(int[] nums) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
            
            if (numbers.size() > 3) {
                int smallest = numbers.first();
                numbers.remove(smallest);
            }
        }
        
        if (numbers.size() < 3) {
            return numbers.last();
        }
        
        return numbers.first();
    }
}