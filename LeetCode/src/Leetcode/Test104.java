package Leetcode;

public class Test104 {
	
	
	public int maxDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	int ld=maxDepth(root.left),rd=maxDepth(root.right);
    	if(ld>rd)
    		return ld+1;
    	else
    		return rd+1;    
    }

	public static void main(String[] args) {
		// Maximum Depth of Binary Tree
		Test104 test=new Test104();
		GetInstance gi=new GetInstance();
		TreeNode root=gi.GetTree(new String[]{"1","2","3","#","#","4","5","#","#","7"});
		System.out.println(test.maxDepth(root));
	}

}
