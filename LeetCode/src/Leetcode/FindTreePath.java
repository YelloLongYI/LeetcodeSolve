package Leetcode;
import java.util.*;

public class FindTreePath {
	
	public boolean findpath(TreeNode root,int val,LinkedList<TreeNode> path){
		path.add(root);
		
		boolean left=false,right=false;
		if(root.val==val){
			return true;
		}
		if(root.left!=null)
			left=findpath(root.left,val,path);
		if(left==true)
			return true;
		if(root.right!=null)
			right=findpath(root.right,val,path);
		if(right==true)
			return true;
		path.pollLast();
		
		return false;
		
	}
	
	public static void main(String[] args){
		TreeNode root=GetInstance.GetTree(new String[]{"1","2","5","3","4"});
		FindTreePath test=new FindTreePath();
		LinkedList<TreeNode> path=new LinkedList<TreeNode>();
		test.findpath(root, 4, path);
		System.out.println(path);
	}
}
