package Leetcode;

public class Test38 {
	
    public String countAndSay(int n) {
    	if(n==1)
    		return "1";
    	String number="1";
    	String s="";
    	for(int i=2;i<=n;i++)
    	{
    	    s="";
    	    String num=""+number,sub=num.substring(0,1);
    	    int count=0;
    	    for(int index=0;index<num.length();index++)
    	    {
    		    if(num.substring(index,index+1).equals(sub))
    			    count++;
    		    else
    		    {
    			    s=s+count+sub;
    			    count=1;
    			    sub=num.substring(index,index+1);
    		    }
    	    }
    	    s=s+count+sub;
    	    number=s;
    	}
    	return s;
        
    }

	public static void main(String[] args) {
		//Count and Say 
		Test38 test=new Test38();
		System.out.println(test.countAndSay(9));
		System.out.println("ok");

	}

}
