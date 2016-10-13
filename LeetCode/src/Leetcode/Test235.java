package Leetcode;
import java.util.*;

public class Test235 {
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        	return null;
        List<TreeNode> queue=new ArrayList<TreeNode>();
        int val1=p.val<q.val?p.val:q.val,val2=p.val<q.val?q.val:p.val;
        TreeNode node=null;
        queue.add(root);
        while(queue.size()!=0)
        {
        	node=queue.get(0);
        	queue.remove(node);
        	if((node.val>=val1&&node.val<=val2)||node.val==val1||node.val==val2)
        		return node;
        	if(node.val<val1)
        		queue.add(node.right);
        	else
        		queue.add(node.left);
        }
        return node;
    }

	public static void main(String[] args) {
		// Lowest Common Ancestor of a Binary Search Tree 

	}

}
