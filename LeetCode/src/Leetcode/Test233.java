package Leetcode;

public class Test233 {
	
	public int countDigitOne(int n)
	{
		if(n<=0)
			return 0;
		int divide=0,rec=0,count=1,prior=0; //count 最低位   prior 比count位数低的所有数，12345中，2的prior为345
		int sum=0;
		while(n!=0)
		{
			rec=n%10;
			divide=n/10;
			
			if(rec==0)
				sum=sum+divide*count;//divide: 左边部分，count:右边部分，即每次出现1，次数为count次
			else if(rec==1)
				sum=sum+divide*count+prior+1; //当最低位为1时，最低位右边的数再+1,   0,1,2,3,...,prior=prior+1
			else
				sum=sum+(divide+1)*count;
			prior=rec*count+prior;
			count=count*10;
			n=divide;	
		}		
		return sum;
	}
	
	public static void main(String[] args)
	{
		Test233 test=new Test233();
		System.out.println(test.countDigitOne(25));
	}
}
