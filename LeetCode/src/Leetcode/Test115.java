package Leetcode;

public class Test115 {
	
	public int numDistinct(String s, String t) {
		if(s==null||t==null||s.length()==0||t.length()==0||s.length()<t.length())
			return 0;
        char[] chars=s.toCharArray(),chart=t.toCharArray();
        int[][] dp=new int[chars.length][chart.length];
        dp[0][0]=chars[0]==chart[0]?1:0;
        for(int i=1;i<chars.length;i++)
        	dp[i][0]=dp[i-1][0]+(chars[i]==chart[0]?1:0);
        for(int j=1;j<chart.length;j++){
        	dp[j][j]=chars[j]==chart[j]?dp[j-1][j-1]:0;
        	for(int i=j+1;i<chars.length;i++){
        		if(chars[i]!=chart[j])
        			dp[i][j]=dp[i-1][j];
        		else
        			dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
        	}
        }
        return dp[chars.length-1][chart.length-1];
    }

	public static void main(String[] args) {
		Test115 test=new Test115();
		System.out.println(test.numDistinct("rabbbit", "rabbit"));

	}

}
