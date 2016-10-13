package Leetcode;
import java.util.*;

public class Test113 {
	
	public void recurse (TreeNode root,List<Integer> path,List<List<Integer>> paths,int sum,int target)
	{
		path.add(root.val);
		if(root.left==null&&root.right==null&&sum+root.val==target)		
			paths.add(new ArrayList<Integer>(path));
		else
		{
			if(root.left!=null)
				recurse(root.left,path,paths,sum+root.val,target);
			if(root.right!=null)
				recurse(root.right,path,paths,sum+root.val,target);
		}
		path.remove(path.size()-1);
	}
	
	public List<List<Integer>> pathSum(TreeNode root,int sum)
	{	
		List<List<Integer>> paths=new ArrayList<List<Integer>>();
		if(root!=null)
		    recurse(root,new ArrayList<Integer>(),paths,0,sum);
		return paths;
	}

	public static void main(String[] args) {
		// Path Sum 2
		Test113 test=new Test113();
		GetInstance gi=new GetInstance();
		TreeNode root=gi.GetTree(new String[]{"5","4","8","11","#","13","4","7","2","#","#","5","1"});
		List<List<Integer>> lists=test.pathSum(root, 22);
		for(int i=0;i<lists.size();i++)
			System.out.println(lists.get(i));

	}

}
