package Leetcode;
import java.util.*;

public class Test96 {
    
	HashMap<Integer,Integer> store=new HashMap<Integer,Integer>();
    
    public int numTrees(int n) {
        if(n==0)
        return 1;
        if(n==1)
        return 1;
        store.put(0,1);
        store.put(1,1);
        for(int i=2;i<=n;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                sum=sum+store.get(j-1)*store.get(i-j);
            }
            store.put(i,sum);
        }
        return store.get(n);
    }
    
    public static void main(String[] args)
    {
    	Test96 test=new Test96();
    	System.out.println(test.numTrees(5));
    }
}
