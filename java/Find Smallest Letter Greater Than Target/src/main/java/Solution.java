class Solution {
    /*
    * T = O(n)
    * S = O(1)
    */
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            char l = letters[i];
            if (l > target) {
                return l;
            }
        }
        return letters[0];
    }
}