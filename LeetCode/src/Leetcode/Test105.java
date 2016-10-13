package Leetcode;

public class Test105 {
	
	public TreeNode build(int[] preorder,int start1,int end1,int[] inorder,int start2,int end2)
	{
		if(start1<0||start2<0||start1>end1||start2>end2)
			return null;
		TreeNode root=new TreeNode(preorder[start1]);
		int mid=-1;
		for(int i=start2;i<=end2;i++)
			if(inorder[i]==preorder[start1])
			{
				mid=i;
				break;
			}
		root.left=build(preorder,start1+1,start1-start2+mid,inorder,start2,mid-1);
		root.right=build(preorder,mid+end1-end2+1,end1,inorder,mid+1,end2);
		return root;
	}
	
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

	public static void main(String[] args) {
		// Construct Binary Tree from Preorder and Inorder Traversal 
		Test105 test=new Test105();
		int[] preorder=new int[]{1,2,4,5,7,8,10,3,6,9};
		int[] inorder=new int[]{4,2,7,5,8,10,1,3,9,6};
		
//		int[] preorder=new int[]{1,2};
//		int[] inorder=new int[]{1,2};
		TreeNode root=test.buildTree(preorder, inorder);
		TravalBinaryTree traval=new TravalBinaryTree();
		traval.PostOrderRecurse(root);

	}

}
