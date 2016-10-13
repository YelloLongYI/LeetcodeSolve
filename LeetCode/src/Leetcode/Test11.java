package Leetcode;

public class Test11 {
	
    public int maxArea(int[] height) {
        int maxarea=0;
        int lmax=0,rmax=0;
        int i=0,j=height.length-1;
        while(i<j)
        {
        	maxarea=Math.max(maxarea,Math.min(height[i], height[j])*(j-i));
        	if(height[i]<height[j])
        	{
        		int h=height[i];
        		while(i<j&&height[i]<=h)
        			i++;
        	}
        	else
        	{
        		int h=height[j];
        		while(i<j&&height[j]<=h)
        			j--;
        	}	
        }
        return maxarea;
    }

	public static void main(String[] args) {
		// Container With Most Water 
		Test11 test=new Test11();
		int[] height=new int[]{3,2,4,5,1};
		System.out.println(test.maxArea(height));

	}

}
