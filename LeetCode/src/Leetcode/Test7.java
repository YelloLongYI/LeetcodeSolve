package Leetcode;
import java.util.*;

public class Test7 {
	public int reverse(int x) {
        List<Integer> stack=new ArrayList<Integer>();
        int temp=0,sum=0;
        int max=0x7fffffff;
        int min=0x80000000;
        temp=x>0?x:(-x);
        while(temp!=0)
        {
            stack.add(temp%10);
            temp=temp/10;
        }
        Iterator<Integer> iter=stack.iterator();
        while(iter.hasNext())
        {
            int num=iter.next();
            if(((sum>max/10)||((sum/10==max/10)&&(num>max%10)))||((sum<min/10)||((sum==min/10)&&(num<min%10))))
         	    return 0;
            sum=10*sum+num;
        }
        
        if(x>0)
        return sum;
        else
        return -sum;
    }
	public static void main(String[] args)
	{
		Test7 test=new Test7();
		System.out.println(test.reverse(-2147483648));
	}
}
