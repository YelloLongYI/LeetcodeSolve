package Leetcode;
import java.util.*;

public class Test94 {
	
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        if(root==null)
        	return list;
        List<TreeNode> stack=new ArrayList<TreeNode>();
        TreeNode node=root;
        while(node!=null||stack.size()!=0)
        {
        	while(node!=null)
        	{
        		stack.add(node);
        		node=node.left;
        	}
        	node=stack.get(stack.size()-1);
        	list.add(node.val);
        	stack.remove(node);
        	node=node.right;
        }
        return list;
    }

	public static void main(String[] args) {
		// Binary Tree Inorder Traversal
		Test94 test=new Test94();

	}

}
