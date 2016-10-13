package Leetcode;

public class Test231 {

	public boolean isPowerOfTwo(int n) 
	{
        if(n<0)
        	return false;
        int max=0x7fffffff;
        int mult=1;
        while(mult!=n)
        {
        	if(mult>max/2)
        		return false;
        	mult=mult*2;
        }
        return true;
    }
	
	
	
	public static void main(String[] args) {
		Test231 test=new Test231();
		System.out.println(test.isPowerOfTwo(16));

	}

}
