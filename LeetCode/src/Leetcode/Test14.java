package Leetcode;

public class Test14 {
	
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0)
    		return "";
    	int length=strs[0].length();
    	for(int index=0;index<length;index++)
    	{
    		char c=strs[0].charAt(index);
    		for(int i=0;i<strs.length;i++)
    		{
    			if(strs[i].length()==index)
    				return strs[i];
    			if(strs[i].charAt(index)!=c)
    				if(index==0)
    					return "";
    				else
    					return strs[i].substring(0,index);
    		}
    	}
    	return strs[0];
    }
    
	public static void main(String[] args) {
		Test14 test=new Test14();
		String[] strs=new String[]{"a"};
		System.out.println(test.longestCommonPrefix(strs));
	}

}
