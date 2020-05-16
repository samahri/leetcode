import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
       char [][] board = new char[][]{
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','R','.','.','.','p'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','p','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'}
                    };
        
        assertEquals(3, new Solution().numRookCaptures(board));
    }

    @Test
    public void test2() {
       char [][] board = new char[][]{
                            {'.','.','.','.','.','.','.','.'},
                            {'.','p','p','p','p','p','.','.'},
                            {'.','p','p','B','p','p','.','.'},
                            {'.','p','B','R','B','p','.','.'},
                            {'.','p','p','B','p','p','.','.'},
                            {'.','p','p','p','p','p','.','.'},
                            {'.','.','.','.','.','.','.','.'},
                            {'.','.','.','.','.','.','.','.'}};
        
        assertEquals(0, new Solution().numRookCaptures(board));
    }

}
