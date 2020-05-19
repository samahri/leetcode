import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void test0() {
        int[] input = {1,1,2};
        assertEquals(2, new Solution().removeDuplicates(input));
        assertArrayEquals(new int[]{1,2,2}, input);
    }

    @Test
    public void test1() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, new Solution().removeDuplicates(input));
        assertArrayEquals(new int[]{0,1,2,3,4,4,4,4,4,4}, input);
    }

}
