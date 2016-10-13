package Leetcode;
import java.util.*;

public class Test27 {
	
	public int removeElement(int[] nums, int val) {
        if(nums==null)
        	return 0;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        	if(nums[i]!=val)
        		list.add(nums[i]);
        for(int i=0;i<list.size();i++)
        	nums[i]=list.get(i);
        return list.size();
    }

	public static void main(String[] args) {
		//Remove Element 
		Test27 test=new Test27();
		int[] a=new int[]{4,5};
		PrintResult pr=new PrintResult();
		System.out.println(test.removeElement(a, 4));

	}

}
