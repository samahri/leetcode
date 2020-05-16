import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution.TreeNode treeNode;

    @Test
    public void test() {
        treeNode = new  Solution.TreeNode(3);
        treeNode.left = new Solution.TreeNode(9);
        Solution.TreeNode subTree = new  Solution.TreeNode(20);
        subTree.left=new Solution.TreeNode(15);
        subTree.right = new Solution.TreeNode(7);
        treeNode.right = subTree;
        
        assertEquals(3, new Solution().maxDepth(treeNode));
    }

}
