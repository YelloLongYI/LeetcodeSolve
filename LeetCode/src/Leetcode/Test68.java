package Leetcode;
import java.util.*;

public class Test68 {
	public int getnumber(String[] words,int maxWidth,int start)
    {
        int sum=0;
        for(int i=start;i<words.length;i++)
        {
            sum+=words[i].length();
            if(sum==maxWidth)
            return (i-start+1);
            else if(sum<maxWidth)
            {
                sum=sum+1;
            }
            else return (i-start);
        }
        return words.length-start;
    }
	
	public String addblank(String[] words,int start,int num,int maxWidth)
	{
		if(start+num>=words.length)
		{
			//最后一行
			int remain=maxWidth;
			String s="";
			for(int i=start;i<words.length;i++)
			{
				s+=words[i];
				remain=remain-words[i].length();
				if(remain>0)
				{
					s+=" ";
					remain--;
				}
			}
			for(int count=1;count<=remain;count++)
				s+=" ";
			return s;
		}
		if(num==1)
		{
			String s=words[start];
			for(int count=1;count<=maxWidth-words[start].length();count++)
				s+=" ";
			return s;
		}
		int sum=0;
		for(int i=start;i<(start+num);i++)
		{
			sum+=words[i].length();
		}
		int blank=maxWidth-sum;
		int blanknum=num-1;
		String s="";
		for(int i=start;i<(start+num);i++)
		{
			s+=words[i];
			if(blanknum!=0)
			{
			    if(blank%blanknum==0)
			    {
				    for(int count=1;count<=blank/blanknum;count++)
					    s+=" ";
				    blank=blank-(blank/blanknum);
				    blanknum--;
			    }
			    else
			    {
				    for(int count=1;count<=(blank/blanknum+1);count++)
					    s+=" ";
				    blank=blank-(blank/blanknum+1);
				    blanknum--;
			    }
			}
		}
		return s;
	}
	
	public static void main(String[] args)
	{
		Test68 test=new Test68();
		String[] words=new String[]{"This", "is", "an", "example", "of", "text", "justification."};
		int L=16;
		int num=0,start=0;
		for(int sum=0;sum<words.length;)
		{
			num=test.getnumber(words, L, start);
			sum+=num;
			System.out.println(test.addblank(words, start, num, L));
			start=start+num;
		}
		
//		System.out.println(test.getnumber(words, L, 0));
//		System.out.println(test.addblank(words, 6, 3, L));
	}
}
