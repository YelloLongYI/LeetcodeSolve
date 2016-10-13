package Leetcode;

public class Test72 {
	
    public int minDistance(String word1, String word2) {
    	char[] a=word1.toCharArray();
    	char[] b=word2.toCharArray();
    	int m=a.length+1,n=b.length+1;
    	int[][] dist=new int[m][n];
    	int tag=0;
    	for(int i=0;i<m;i++)
    		dist[i][0]=i;
    	for(int i=0;i<n;i++)
    		dist[0][i]=i;
    	for(int i=1;i<m;i++)
    		for(int j=1;j<n;j++)
    		{
    			if(a[i-1]==b[j-1])
    				tag=0;
    			else
    				tag=1;
    			dist[i][j]=Math.min(Math.min(dist[i-1][j],dist[i][j-1])+1, dist[i-1][j-1]+tag);
    		}
        return dist[m-1][n-1];
    }

	public static void main(String[] args) {
		// Edit Distance
		Test72 test=new Test72();
		System.out.println(test.minDistance("eebc", "bca"));

	}

}
