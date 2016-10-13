package Leetcode;
import java.util.*;


public class Test236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        	return null;
        TreeNode res=null;       
        TreeNode lChild=lowestCommonAncestor(root.left, p, q),rChild=lowestCommonAncestor(root.right, p, q);
        if(lChild!=null&&rChild!=null)
        	res=root;
        else 
        	res=lChild==null?rChild:lChild;
        if(root==p||root==q){
        	res=root;
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
