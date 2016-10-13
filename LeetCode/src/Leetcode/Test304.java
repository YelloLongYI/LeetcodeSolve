package Leetcode;

public class Test304 {
	
	int[][] sum;
	
	public void NumMatrix(int[][] matrix) {
        int n=matrix.length;
        if(n==0)
        	return;
        int m=matrix[0].length;
        if(m==0)
        	return;
        sum=new int[n][m];
        for(int i=0;i<n;i++){
        	int count=0;
        	for(int j=0;j<m;j++)
        	{
        		count+=matrix[i][j];
        		sum[i][j]=count;
        	}
        }
        return;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int count=0;;
        for(int i=row1;i<=row2;i++){
        	if(col1==0)
        		count+=sum[i][col2];
        	else
        		count+=sum[i][col2]-sum[i][col1-1];
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
