package Leetcode;


public class Test50 {
	
	public double myPow(double x, int n) {
        if(n==1)
        return x;
        if(n==0)
        return 1;
        if(n>0)
        {
            if(n%2==0)
            return myPow(x*x,n/2);
            else
            return x*myPow(x*x,n/2);                                                                                                                                                                                                                                                                        
        }
        else
        {
        	if(n==0x80000000)
            return 1/x*myPow(1/x,-(n+1));
        	else
        		return myPow(1/x,-n);
        }
    }
	
	public static void main(String[] args){
		Test50 test=new Test50();
		System.out.println(test.myPow(-1.00000, -2147483648));
	}
}
