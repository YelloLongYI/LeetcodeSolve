package Leetcode;
import java.util.*;

public class Test222 {
	
	public TreeNode findnode(TreeNode root,int num)
	{
		TreeNode node=root;
		List<Integer> record=new ArrayList<Integer>();
		while(num/2!=0)
		{
			record.add(num%2);
			num=num/2;
		}
		for(int i=record.size()-1;i>=0;i--)
			if(record.get(i)==0)
				node=node.left;
			else
				node=node.right;
		return node;
	}
	
    public int countNodes(TreeNode root)
    {
        if(root==null)
        	return 0;
        if(root.left==null)
        	return 1;
        int count=0;
        int level1,level2;
        TreeNode node=root;
        while(node!=null)
        {
        	node=node.left;
        	count++;
        }
        level1=count;
        count=0;
        node=root;
        while(node!=null)
        {
        	node=node.right;
        	count++;
        }
        level2=count;
        if(level1==level2)
        	return (int)Math.pow(2, level1)-1;
        int left=(int)Math.pow(2, level2-1),right=(int)Math.pow(2, level2)-1;
        while(left!=right)
        {
        	int mid=(left+right)/2;
        	node=findnode(root,mid);
        	if(node.left!=null&&node.right==null)
        		return mid*2+1;
        	if(node.left==null)
        		right=mid-1;
        	else
        		left=mid+1;
        }
        return left*2;
    }
    
    public int countNodes2(TreeNode root)
    {
    	if(root==null)
    		return 0;
    	int level1=getleft(root),level2=getright(root);
    	if(level1==level2)
    		return (1<<level1)-1;
    	else
    		return countNodes2(root.left)+countNodes2(root.right)+1;
    }
    
    public int getleft(TreeNode root)
    {
    	TreeNode node=root;
    	int count=0;
    	while(node!=null)
    	{
    		node=node.left;
    		count++;
    	}
    	return count;
    }
    
    public int getright(TreeNode root)
    {
    	TreeNode node=root;
    	int count=0;
    	while(node!=null)
    	{
    		node=node.right;
    		count++;
    	}
    	return count;
    }

	public static void main(String[] args) {
		Test222 test=new Test222();
		TreeNode[] nodes=new TreeNode[]{new TreeNode(1),new TreeNode(2),new TreeNode(3),new TreeNode(4),
				new TreeNode(5),new TreeNode(6),new TreeNode(7),new TreeNode(8)};
		TreeNode root=nodes[0];
		nodes[0].left=nodes[1];
		nodes[0].right=nodes[2];
		nodes[1].left=nodes[3];
		nodes[1].right=nodes[4];
		nodes[2].left=nodes[5];
		nodes[2].right=nodes[6];
		//nodes[3].left=nodes[7];
		System.out.println(test.countNodes2(root));
	}

}
