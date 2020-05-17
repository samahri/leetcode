class Solution {
    /*
    * T = O(n^2)
    * S = O(1)
    */
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = i + 1;
                int tmp = arr[i];
                while (j < arr.length) {
                    int tmp1 = arr[j];
                    arr[j] = tmp;
                    tmp = tmp1;
                    j++;
                }
                i++;
            }
        }
    }
}