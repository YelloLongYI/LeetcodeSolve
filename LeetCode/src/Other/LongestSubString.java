package Other;
import java.util.*;

public class LongestSubString {
	
	public int longestlength(String text,String query)
	{
		//最长子串的长度
		char[] t=text.toCharArray(),q=query.toCharArray();
		int[][] matrix=new int[q.length][t.length];
		int length=0;
		for(int i=0;i<q.length;i++)
			for(int j=0;j<t.length;j++)
			{
				if(q[i]==t[j])
				{
					if(i==0||j==0)
					{
						matrix[i][j]=1;
						length=1;
					}
					else
					{
						matrix[i][j]=matrix[i-1][j-1]+1;
						if(matrix[i][j]>length)
							length=matrix[i][j];
					}
				}
					
			}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubString test=new LongestSubString();
		System.out.println(test.longestlength("acbcbc", "bcbd"));

	}

}
