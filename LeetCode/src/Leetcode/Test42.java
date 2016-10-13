package Leetcode;

public class Test42 {
	
	public int trap(int[] height) {
		if(height.length<=2)
			return 0;
		int maxheight=0;
		int[] leftmostheight=new int[height.length];
		int[] rightmostheight=new int[height.length];
		for(int i=0;i<height.length;i++)
		{
			if(height[i]>maxheight)
				maxheight=height[i];
			leftmostheight[i]=maxheight;
		}
		maxheight=0;
		for(int i=height.length-1;i>=0;i--)
		{
			if(height[i]>maxheight)
				maxheight=height[i];
			rightmostheight[i]=maxheight;
		}
		int sum=0;
		for(int i=1;i<height.length-1;i++)
		{
			int high=Math.min(leftmostheight[i], rightmostheight[i])-height[i];
			if(high>0)
			    sum+=high;
		}
		return sum;
    }

	public static void main(String[] args) {
		// Trapping Rain Water 
		Test42 test=new Test42();
		int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(test.trap(height));

	}

}
