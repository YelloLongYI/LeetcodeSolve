package Leetcode;

public class Test91 {
	
	
//    public int numDecodings(String s) {
//    	if(s.length()==0)
//    		return 1;
//        char[] a=s.toCharArray();      
//        if(a[0]=='0')
//        	return 0;
//        for(int i=a.length-1;i>0;i--)
//        	if(a[i]=='0'&&(a[i-1]>'2'||a[i-1]=='0'))
//        		return 0;
//        if(a.length==1)
//        	return 1;
//        if(a[0]>'2')
//        	return numDecodings(s.substring(1));
//        if(a[1]=='0')
//        	return numDecodings(s.substring(2));
//        if(a[0]=='1')
//        {
//        	return numDecodings(s.substring(1))+numDecodings(s.substring(2));
//        }
//        else 
//        	if(a[1]<='6')
//        		return numDecodings(s.substring(1))+numDecodings(s.substring(2));
//        	else
//        		return numDecodings(s.substring(2));
//        
//    }
	
	public int numDecodings(String s) {
    	if(s.length()==0)
    		return 0;
    	char[] a=s.toCharArray();
    	if(a[0]=='0')
    		return 0;                  
    	for(int i=a.length-1;i>0;i--)
    		if(a[i]=='0'&&(a[i-1]=='0'||a[i-1]>'2'))	
    			return 0;
    	if(a.length==1)
    		return 1;
    	int[] f=new int[a.length];
    	
    	if(a[a.length-1]=='0')
    	{
    		f[a.length-1]=0;
    		f[a.length-2]=1;
    	}
    	else
    		f[a.length-1]=1;
    	
    	if(a[a.length-1]!='0')
    	{
    		if((a[a.length-2]=='2'&&a[a.length-1]>'6')||a[a.length-2]>='3')
    			f[a.length-2]=1;
    		else if(a[a.length-2]=='0')
    			f[a.length-2]=0;
    		else f[a.length-2]=2;
    	}
    	//System.out.println(f[a.length-1]+"  "+f[a.length-2]);
    	
    	for(int i=a.length-3;i>=0;i--)
    	{
    		if(a[i]=='0')
    			f[i]=0;
    		else if(a[i]=='1')
    			f[i]=f[i+1]+f[i+2];
    		else if(a[i]=='2'&&a[i+1]<='6')
    			    f[i]=f[i+1]+f[i+2];
    		    else
    			    f[i]=f[i+1];
    		//System.out.println(f[i]);
    	}
    	//System.out.println();
    	return f[0];
    			
        
    }

	public static void main(String[] args) {
		// Decode Ways
		Test91 test=new Test91();
		System.out.println(test.numDecodings("611"));
	}

}
