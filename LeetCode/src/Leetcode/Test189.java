package Leetcode;
import java.util.*;

public class Test189 {
	public void rotate(int[] nums, int k) {
		if(k==0)
	      return;
		 if(k%nums.length==0)
		        return;
	        int index=k%nums.length;
	        int temp;
	        int[] save=new int[index];
	        for(int i=0;i<index;i++)
	        save[i]=nums[i];
	        for(int i=0;i<nums.length;i++)
	        {
	            temp=nums[(i+index)%nums.length];
	            nums[(i+index)%nums.length]=save[i%index];
	            save[i%index]=temp;
	            
	        }
        for(int i=0;i<nums.length;i++)
        	System.out.print(nums[i]+" ");
        
    }
	public static void main(String[] args){
		int[] a=new int[]{1};
		int k=1;
		Test189 test=new Test189();
		test.rotate(a, k);
		
	}
}
