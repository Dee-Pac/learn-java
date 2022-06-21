package learn.java.datastructures;

public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private Integer val;

    public void TreeNode(Integer val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void TreeNode(Integer val){
        TreeNode(val, null, null);
    }

}
