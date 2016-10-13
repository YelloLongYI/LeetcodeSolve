package Leetcode;
import java.util.*;

public class Test102 {
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(root==null)
        	return result;
        List<Integer> temp=new ArrayList<Integer>();
        List<TreeNode> queue=new ArrayList<TreeNode>();
        TreeNode node=root;
        queue.add(node);
        int index=0,exp=1,expnext=0;
        while(queue.size()>0)
        {
        	node=queue.get(0);
        	queue.remove(node);
        	temp.add(node.val);
        	index++;
        	if(node.left!=null)
        	{
        		queue.add(node.left);
        		expnext++;
        	}
        	if(node.right!=null)
        	{
        		queue.add(node.right);
        		expnext++;
        	}
        	if(index==exp)
        	{
        		index=0;
        		exp=expnext;
        		expnext=0;
        		result.add(new ArrayList<Integer>(temp));
        		temp.clear();
        	}
        	
        }
        return result;
    }

	public static void main(String[] args) {
		// Binary Tree Level Order Traversal
		Test102 test=new Test102();
		TreeNode[] nodes=new TreeNode[]{new TreeNode(3),new TreeNode(9),new TreeNode(20),new TreeNode(15),
				new TreeNode(7)};
		nodes[0].left=nodes[1];
		nodes[0].right=nodes[2];
		nodes[2].left=nodes[3];
		nodes[2].right=nodes[4];
		System.out.println(test.levelOrder(nodes[0]).get(2));
	}

}
