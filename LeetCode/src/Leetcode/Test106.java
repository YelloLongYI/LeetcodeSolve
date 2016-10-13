package Leetcode;

public class Test106 {
	
	 public TreeNode build(int[] inorder,int start1,int end1,int[] postorder,int start2,int end2)
	 {
		// System.out.println(start1+"  "+end1+"   "+start2+"   "+end2);
		 if(start1>end1||start2>end2||start1<0||start2<0)
			 return null;
		 TreeNode root=new TreeNode(postorder[end2]);
		 System.out.println(postorder[end2]);
		 int mid=-1;
		 for(int i=start1;i<=end1;i++)
			 if(inorder[i]==postorder[end2])
			 {
				 mid=i;
				 break;
			 }
		 root.left=build(inorder,start1,mid-1,postorder,start2,start2+mid-start1-1);
		 root.right=build(inorder,mid+1,end1,postorder,end2+mid-end1,end2-1);
		 return root;
	 }
	    
	 public TreeNode buildTree(int[] inorder, int[] postorder) 
	 {
		 return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
	 }

	public static void main(String[] args) {
		// Construct Binary Tree from Inorder and Postorder Traversal 
		Test106 test=new Test106();
		TravalBinaryTree traval=new TravalBinaryTree();
//		int[] inorder=new int[]{4,2,7,5,8,10,1,3,9,6};
//		int[] postorder=new int[]{4,7,10,8,5,2,9,6,3,1};
		
		int[] inorder=new int[]{2,1};
		int[] postorder=new int[]{2,1};
		
		TreeNode root=test.buildTree(inorder, postorder);
		//System.out.println(root.right.right.right.right.val);
		//traval.LevelOrder(root);
		//traval.PostOrderRecurse(root);

	}

}
