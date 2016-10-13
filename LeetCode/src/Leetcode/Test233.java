package Leetcode;

public class Test233 {
	
	public int countDigitOne(int n)
	{
		if(n<=0)
			return 0;
		int divide=0,rec=0,count=1,prior=0; //count ���λ   prior ��countλ���͵���������12345�У�2��priorΪ345
		int sum=0;
		while(n!=0)
		{
			rec=n%10;
			divide=n/10;
			
			if(rec==0)
				sum=sum+divide*count;//divide: ��߲��֣�count:�ұ߲��֣���ÿ�γ���1������Ϊcount��
			else if(rec==1)
				sum=sum+divide*count+prior+1; //�����λΪ1ʱ�����λ�ұߵ�����+1,   0,1,2,3,...,prior=prior+1
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
