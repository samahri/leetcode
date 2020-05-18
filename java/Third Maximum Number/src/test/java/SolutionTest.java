import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test0() {
        int[] input = {3, 2, 1};
        assertEquals(1, new Solution().thirdMax(input));
    }

    @Test
    public void test1() {
        int[] input = {1, 2};
        assertEquals(2, new Solution().thirdMax(input));
    }

    @Test
    public void test2() {
        int[] input = {2, 2, 3, 1};
        assertEquals(1, new Solution().thirdMax(input));
    }
}
