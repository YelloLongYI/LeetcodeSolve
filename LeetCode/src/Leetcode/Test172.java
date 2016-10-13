package Leetcode;

public class Test172 {
	
    public int trailingZeroes(int n) {
    	int num=0;
    	while(n>0)
    	{
    		num+=n/5;
    		n=n/5;
    	}
    	return num;
    }

	public static void main(String[] args) {
		// Factorial Trailing Zeroes 
		Test172 test=new Test172();
		System.out.println(test.trailingZeroes(25));

	}

}
