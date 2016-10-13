package Leetcode;

public class Test98 {
	
	public boolean isValid(TreeNode root,int lower,int upper)
	{
		if(root==null)
			return true;
		if(root.val<lower||root.val>upper)
			return false;
		if((root.val==0x80000000&&root.left!=null)||(root.val==0x7fffffff&&root.right!=null))
			return false;
		return isValid(root.left,lower,root.val-1)&&isValid(root.right,root.val+1,upper);
	}
	
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        	return true;
        int min=0x80000000,max=0x7fffffff;
        return isValid(root,min,max);
    }

	public static void main(String[] args) {
		// Validate Binary Search Tree 
		Test98 test=new Test98();
		TreeNode root=new GetInstance().GetTree(new String[]{"3","1","5","#","#","2","9"});
		System.out.println(test.isValidBST(root));

	}

}
