package Leetcode;
import java.util.*;

public class Test20 {
	
    public boolean isValid(String s) {
        char[] c=s.toCharArray();
        List<Character> stack=new ArrayList<Character>();
        for(int i=0;i<c.length;i++)
        {
        	if(c[i]=='('||c[i]=='['||c[i]=='{')
        		stack.add(c[i]);
        	else
        	{
        		if(stack.size()==0)
        			return false;
        		if(c[i]==')'&&stack.get(stack.size()-1)!='(')
        			return false;
        		if(c[i]==']'&&stack.get(stack.size()-1)!='[')
        			return false;
        		if(c[i]=='}'&&stack.get(stack.size()-1)!='{')
        			return false;
        		stack.remove(stack.size()-1);
        	}      	
        }
        if(stack.size()==0)
            return true;
        else
        	return false;
    }

	public static void main(String[] args) {
		Test20 test=new Test20();
		System.out.println(test.isValid("["));

	}

}
