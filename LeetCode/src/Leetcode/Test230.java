package Leetcode;
import java.util.*;

public class Test230 {
	
	public int kthSmallest(TreeNode root, int k) {
        if(root==null)
			return 0;		
		List<TreeNode> list=new ArrayList<TreeNode>();
		int count=0;
		TreeNode node=root;
		while(node!=null||list.size()!=0)
		{
			while(node!=null)
			{
				list.add(node);
				node=node.left;
			}
			node=list.get(list.size()-1);
			count++;
			if(count==k)
			return node.val;
			list.remove(list.size()-1);
			node=node.right;
		}
		return 0;
    }
	
	public static void main(String[] args)
	{
		
	}
}
