import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;;

public class SolutionTest {

    @Test
    public void test() {
        char c = 'e';
        String s = "loveleetcode";
        int[] sol = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertArrayEquals(sol, new Solution().shortestToChar(s,c));
    }

}
