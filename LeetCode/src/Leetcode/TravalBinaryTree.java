package Leetcode;
import java.util.*;

public class TravalBinaryTree {
	
	//test226
	
	public static void LevelOrder(TreeNode root)
	{
		List<TreeNode> Queen=new ArrayList<TreeNode>();
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		
		TreeNode head;
		if(root==null)
		{
			System.out.println("root is null");
			return;
		}
		Queen.add(root);
		while(Queen.size()!=0)
		{
			head=Queen.get(0);
			if(head.left!=null)
				Queen.add(head.left);
			if(head.right!=null)
				Queen.add(head.right);
			System.out.print(head.val+" ");
			Queen.remove(0);
		}
		System.out.println();
	}
	
	public void PostOrderRecurse(TreeNode root)
	{
		if(root==null)
			return;
		
		PostOrderRecurse(root.left);
		PostOrderRecurse(root.right);
		System.out.print(root.val+" ");
	}
	
	public void InOrderRecurse(TreeNode root)
	{
		if(root==null)
			return;
		InOrderRecurse(root.left);
		System.out.print(root.val+"   ");
		InOrderRecurse(root.right);
	}
	
	public void InOrder(TreeNode root)
	{
		if(root==null)
			return;		
		List<TreeNode> list=new ArrayList<TreeNode>();
		TreeNode node=root;
		while(node!=null||list.size()!=0)
		{
			while(node!=null)
			{
				list.add(node);
				node=node.left;
			}
			node=list.get(list.size()-1);
			System.out.print(node.val+"   ");
			list.remove(list.size()-1);
			node=node.right;
		}
	}
	
	public void PreOrder(TreeNode root)
	{
		
	}
}
