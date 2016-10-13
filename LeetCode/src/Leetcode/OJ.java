package Leetcode;


public class OJ {
	public int findMax(TreeNode root,int val,int length){
		if(root==null)
			return length;
		int max=length+(root.val==val?1:0);
		int left=0,right=0;
		if(root.val==val){
			left=findMax(root.left,root.val,max);
			right=findMax(root.right,root.val,max);
		}else{
			left=findMax(root.left,root.val,0);
			right=findMax(root.right,root.val,0);
		}
		return Math.max(max, Math.max(left, right));
	}
	
	public int findPath(TreeNode root) {
        if(root==null)
        	return 0;
        return findMax(root,root.val,0);
    }
	
	public static void main(String[] args){
		OJ test=new OJ();
		TreeNode root=GetInstance.GetTree(new String[]{"1","1","0","#","0","#","#","0","#","0","#"});
		System.out.println(test.findPath(root));
	}
}
