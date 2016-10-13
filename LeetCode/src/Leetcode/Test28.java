package Leetcode;

public class Test28 {
	
    public int strStr(String haystack, String needle) {
        char[] a=haystack.toCharArray();
        char[] b=needle.toCharArray();
        for(int i=0;i<a.length-b.length+1;i++)
        {
        	int j=0;
        	for(;j<b.length;j++)
        	{
        		if(a[i+j]!=b[j])
        			break;
        	}
        	if(j==b.length)
        		return i;
        }
        return -1;
    }
    
    public int kmp(String haystack, String needle) {
    	if(needle.length()==0)
    		return 0;
        if(needle==null||haystack==null||haystack.length()<needle.length())
        	return -1;
        int[] next=getnext(needle);
        int length1=haystack.length(),length2=needle.length(),j=0,i=0;
        while(i<length1)
        {
        	if(haystack.charAt(i)==needle.charAt(j))
        	{
        		i++;
        		j++;
        	}
        	else
        	{
        		if(next[j]!=-1)
        		{
        		    j=next[j];
        		}
        		else
        			i++;
        	}
        	if(j==length2)
        		return i-length2;
        }
        return -1;
    }
    
    public int[] getnext(String needle)
    {
    	int[] next=new int[needle.length()];
    	int j;
    	for(int i=1;i<next.length;i++)
    	{
    		j=i-1;   		
    		do
    		{
    			if(needle.charAt(i)==needle.charAt(next[j]))
    			{
    				next[i]=next[j]+1;
    				break;
    			}
    			else
    				j=next[j]-1;
    		}while(j>=0);
    	}
    	for(int i=next.length-1;i>=1;i--)
    		next[i]=next[i-1];
    	next[0]=-1;
    	return next;
    }

	public static void main(String[] args)
	{
		//Implement strStr
		Test28 test=new Test28();
		
		String a="";
		System.out.println(test.kmp(a, ""));
	}
}
