package Leetcode;

public class Test10 {
	
    public boolean isMatch(String s, String p) {
//    	if(p==null)
//    		return s==null;
//    	if(s==null)
//    		return p==null;
    	int lens=s.length();
    	int lenp=p.length();
    	if(lenp==0)
    		return lens==0;
    	if(lenp==1)
    		if(lens==0)
    			return false;
    		else
    			if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')
    				return isMatch(s.substring(1),p.substring(1));
    			else
    				return false;
    	if(p.charAt(1)!='*')
    		if(lens==0)
    			return false;
    		else
    			if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')
    				return isMatch(s.substring(1),p.substring(1));
    			else
    				return false;
    	else
    	{
    		while(s.length()>0)
    		{
    			if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')
    				if(isMatch(s,p.substring(2))==true)  //Èç¹û*È¡0
    					return true;
    				else
    					s=s.substring(1);
    			else 
    				break;
    		}
    		return isMatch(s,p.substring(2));
    	}
    }

	public static void main(String[] args) {
		Test10 test=new Test10();
		System.out.println(test.isMatch("aaaaa", "a*aaaaa"));
	}

}
