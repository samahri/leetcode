class Solution {
    /**
    * T = O(N^2)
    * S = O(N)
    */
    public int[] shortestToChar(String S, char C) {
        int[] sol = initializeSol(S.length());
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                int j = 0;
                
                while (j < S.length()) {
                    int l = Math.abs(i - j);
                    if (sol[j] > l) {
                        sol[j] = l;
                    }
                    j++;
                }
            }
        }
        
        return sol;
    }
    
    private int[] initializeSol(int length) {
        int[] sol = new int[length];
        
        for (int i = 0; i < length; i++) {
            sol[i] = length;
        }
        
        return sol;   
    }
}