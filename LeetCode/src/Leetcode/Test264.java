package Leetcode;

public class Test264 {
	
    public int nthUglyNumber(int n) {
        int[] ugly=new int[n];
        ugly[0]=1;
        int index=1;
        int index2=0,index3=0,index5=0;
        while(index<n)
        {
        	int min=Math.min(ugly[index2]*2, Math.min(ugly[index3]*3, ugly[index5]*5));
        	if(min==ugly[index2]*2)
        		index2++;
        	if(min==ugly[index3]*3)
        		index3++;
        	if(min==ugly[index5]*5)
        		index5++;
        	ugly[index]=min;
        	index++;
        }
        return ugly[n-1];
    }

	public static void main(String[] args) {
		// Ugly Number II 
		Test264 test=new Test264();
		System.out.println(test.nthUglyNumber(8));

	}

}
