import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test0() {
        char[] input = {'c', 'f', 'j'};
        char target = 'a';
        assertEquals('c', new Solution().nextGreatestLetter(input, target));
    }

    @Test
    public void test1() {
        char[] input = {'c', 'f', 'j'};
        char target = 'c';
        assertEquals('f', new Solution().nextGreatestLetter(input, target));
    }

    @Test
    public void test2() {
        char[] input = {'c', 'f', 'j'};
        char target = 'd';
        assertEquals('f', new Solution().nextGreatestLetter(input, target));
    }

    @Test
    public void test3() {
        char[] input = {'c', 'f', 'j'};
        char target = 'g';
        assertEquals('j', new Solution().nextGreatestLetter(input, target));
    }

    @Test
    public void test4() {
        char[] input = {'c', 'f', 'j'};
        char target = 'j';
        assertEquals('c', new Solution().nextGreatestLetter(input, target));
    }

    @Test
    public void test5() {
        char[] input = {'c', 'f', 'j'};
        char target = 'k';
        assertEquals('c', new Solution().nextGreatestLetter(input, target));
    }
}
