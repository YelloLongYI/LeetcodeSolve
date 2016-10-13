package Leetcode;
import java.util.*;

public class Test107 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<TreeNode> stack=new Stack<TreeNode>();
        Stack<List<Integer>> res=new Stack<List<Integer>>(),temp=new Stack<List<Integer>>();
        if(root==null)
        	return res;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> line_record=new LinkedList<Integer>();
        int curlevel=1,nextlevel=0,cur_count=0;
        queue.add(root);
        while(!queue.isEmpty()){
        	root=queue.poll();
        	line_record.add(root.val);
        	cur_count++;
        	if(root.left!=null){
        		queue.add(root.left);
        		nextlevel++;
        	}
        	if(root.right!=null){
        		queue.add(root.right);
        		nextlevel++;
        	}
        	if(cur_count==curlevel){
        		temp.add(new LinkedList(line_record));
        		line_record.clear();
        		cur_count=0;
        		curlevel=nextlevel;
        		nextlevel=0;
        	}
        }
        while(!temp.isEmpty())
        	res.push(temp.pop());
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
