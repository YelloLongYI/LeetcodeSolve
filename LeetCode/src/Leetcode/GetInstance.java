package Leetcode;
import java.util.*;

public class GetInstance {
	public static ListNode GetListNode(ListNode[] lists,int start,int end)
	{
		ListNode head=lists[start],node=head;
		for(int i=start+1;i<=end;i++)
		{
			node.next=lists[i];
			node=node.next;
		}
		return head;
	}
	
	public static ListNode GetListNode(int[] lists,int start,int end)
	{
		ListNode head=new ListNode(lists[start]),node=head;
		for(int i=start+1;i<=end;i++)
		{
			node.next=new ListNode(lists[i]);
			node=node.next;
		}
		return head;
	}
	
	public static TreeNode GetTree(String[] c)
	{
		if(c.length==0)
			return null;
		TreeNode root=new TreeNode(Integer.parseInt(c[0])),node=root;
		List<TreeNode> queue=new ArrayList<TreeNode>();
		queue.add(node);
		for(int i=1;i<c.length;)
		{
			node=queue.get(0);
			queue.remove(node);
			if(!c[i].equals("#"))
			{
				node.left=new TreeNode(Integer.parseInt(c[i]));
				queue.add(node.left);
			}
			i++;
			if(i<c.length)
			    if(!c[i].equals("#"))
			    {
				    node.right=new TreeNode(Integer.parseInt(c[i]));
				    queue.add(node.right);
			    }
			i++;
			
			
		}
		
		return root;
	}
	
	public static void main(String[] args)
	{
		GetInstance gi=new GetInstance();
		TreeNode root=gi.GetTree(new String[]{"1","#","2"});
		System.out.println(root.right.val);
	}
}
