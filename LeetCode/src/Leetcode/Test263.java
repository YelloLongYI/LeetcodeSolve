package Leetcode;

public class Test263 {
	
    public boolean isUgly(int num) {
    	if(num<=0)
    		return false;

        while(true)
        	if(num%2==0)
        		num/=2;
        	else
        		break;
        while(true)
        	if(num%3==0)
        		num/=3;
        	else
        		break;
        while(true)
        	if(num%5==0)
        		num/=5;
        	else
        		break;
        if(num==1)
        	return true;
        else
        	return false;
    }

	public static void main(String[] args) {
		// Ugly Number
		Test263 test=new Test263();
		System.out.println(test.isUgly(10));

	}

}
