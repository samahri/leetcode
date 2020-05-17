import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;;

public class SolutionTest {

    @Test
    public void test1() {
        
        int[] input = {1,0,2,3,0,4,5,0};
        int[] output = {1,0,0,2,3,0,0,4};
        new Solution().duplicateZeros(input);
        assertArrayEquals(output, input);
    }

    @Test
    public void test2() {
        
        int[] input = {1,2,3};
        int[] output = {1,2,3};
        new Solution().duplicateZeros(input);
        assertArrayEquals(output, input);
    }

}
