package Leetcode;
import java.util.*;

public class Test103 {
	
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	if(root==null)
    		return result;
    	List<TreeNode> queue=new ArrayList<TreeNode>();
    	List<Integer> temp=new ArrayList<Integer>();
    	TreeNode node;
    	queue.add(root);
    	int exp=1,index=0,expnext=0,level=1;
    	while(!queue.isEmpty())
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
    			exp=expnext;
    			expnext=0;
    			index=0;
    			System.out.println(temp);
    			if(level%2==1)
    				result.add(new ArrayList<Integer>(temp));
    			else
    			{
    				List<Integer> newtemp=new ArrayList<Integer>();
    				for(int i=temp.size()-1;i>=0;i--)
    					newtemp.add(temp.get(i));
    				result.add(newtemp);
    			}
    			temp.clear();
    			level++;
    		}
    	}
    	return result;
        
    }

	public static void main(String[] args) {
		// Binary Tree Zigzag Level Order Traversal
		Test103 test=new Test103();
		TreeNode root=new GetInstance().GetTree(new String[]{"3","9","20","#","#","15","7"});
		test.zigzagLevelOrder(root);
		System.out.println("ok");
	}

}
