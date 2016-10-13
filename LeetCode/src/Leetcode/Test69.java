package Leetcode;

public class Test69 {
	
//	public int judgelegal(int x)
//	{
//		
//	}
	
	public int mysqrt(int x)
	{
		//Å£¶Ùµü´ú·¨
		if(x==0)
			return 0;
		double x0=1,old=100;
		while(Math.abs(x0-old)>0.0001)
		{
			old=x0;
			x0=1.0*x/(2*x0)+x0/2;
		}
		System.out.println(x0);
		return (int)x0;
	}
	public static void main(String[] args){
		Test69 test=new Test69();
		System.out.println(test.mysqrt(2));
	}
}
