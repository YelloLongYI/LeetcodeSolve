package Leetcode;

public class Test9 {
	
    public boolean isPalindrome(int x) {
        int num=x;
        if(num<0)
        	return false;
        int divide=1;
        while(num/divide>=10)
        	divide=divide*10;
        while(num!=0&&divide!=1)
        {
        	if(num%10!=num/divide)
        	{
        		return false;
        	}
        	num=num%divide/10;
        	divide=divide/100;
        }
        return true;
    }

	public static void main(String[] args) {
		Test9 test=new Test9();
		System.out.println(test.isPalindrome(-2147483648));
	}

}
