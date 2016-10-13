package Leetcode;

public class Test240 {
	
	public boolean search(int[] a,int target)
	{
		if(a[0]>target||a[a.length-1]<target)
			return false;
		int low=0,high=a.length-1,mid=0;
		while(low<high)
		{
			mid=(low+high)/2;
			if(a[mid]==target)
				return true;
			if(a[mid]<target)
				low=mid+1;
			if(a[mid]>target)
				high=mid-1;
		}
		if(a[low]==target)
			return true;
		return false;
	}
	
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
        	if(search(matrix[i],target)==true)
        		return true;
        	
        }
        return false;
    }

	public static void main(String[] args) {
		// Search a 2D Matrix II 
		Test240 test=new Test240();
//		int[][] a=new int[][]{{1,   4,  7, 11, 15},
//				  {2,   5,  8, 12, 19},
//				  {3,   6,  9, 16, 22},
//				  {10, 13, 14, 17, 24},
//				  {18, 21, 23, 26, 30}};
		int[][] a=new int[][]{{1}};
		System.out.println(test.searchMatrix(a, 1));

	}

}
