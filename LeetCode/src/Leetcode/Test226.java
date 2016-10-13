package Leetcode;

public class Test226 {
	public TreeNode copy(TreeNode cop,TreeNode tree)
    {

        
        if(tree==null)
        {
            return null;
        }
        cop.val=tree.val;
        if(tree.right!=null)
        {
        	cop.left=new TreeNode(1);
            copy(cop.left,tree.right);
        }
        if(tree.left!=null)
        {
        	cop.right=new TreeNode(1);
            copy(cop.right,tree.left);
        }
        return cop;
    }
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return null;
        TreeNode tree=copy(new TreeNode(root.val),root);
        return tree;
    }
    
    public static void main(String[] args){
    	
    	Test226 test=new Test226();
    	
    	TreeNode[] tree=new TreeNode[]{new TreeNode(4),new TreeNode(2),new TreeNode(7),new TreeNode(1),new TreeNode(3),
    			new TreeNode(6),new TreeNode(9)};
    	TreeNode root=tree[0];
    	root.left=tree[1];
    	root.right=tree[2];
    	tree[1].left=tree[3];
    	tree[1].right=tree[4];
    	tree[2].left=tree[5];
    	tree[2].right=tree[6];
    	
    	TreeNode print=test.invertTree(root);
    	TravalBinaryTree traval=new TravalBinaryTree();
    	//traval.LevelOrder(root);
    	traval.InOrder(root);
    	
    	System.out.println("ok");
    }
}
