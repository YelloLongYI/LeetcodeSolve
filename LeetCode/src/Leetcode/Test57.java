package Leetcode;
import java.util.*;

public class Test57 {
	
	
	
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) 
    {
    	
        List<Interval> list=new ArrayList<Interval>();
        Interval temp;
        int start=newInterval.start,end=newInterval.end;
        int i=0;
        for(;i<intervals.size();i++)
        {
        	temp=intervals.get(i);
        	if(temp.start>=newInterval.start)
        	{
        		start=newInterval.start;
        		break;
        	}
        	if(temp.end>=newInterval.start)
        	{
        		start=temp.start;
        		break;
        	}
        	list.add(temp);
        }
        for(;i<intervals.size();i++)
        {
        	temp=intervals.get(i);
        	if(temp.start>newInterval.end)
        	{
        		i--;
        		end=newInterval.end;
        		break;
        	}
        	if(temp.end>=newInterval.end)
        	{
        		end=temp.end;
        		break;
        	}
        }
        list.add(new Interval(start,end));
        for(i=i+1;i<intervals.size();i++)
        	list.add(intervals.get(i));
        return list;
    }

	public static void main(String[] args) {

		Test57 test=new Test57();
		List<Interval> list=new ArrayList<Interval>();
//		list.add(new Interval(1,2));
//		list.add(new Interval(3,5));
//		list.add(new Interval(6,7));
//		list.add(new Interval(8,10));
//		list.add(new Interval(12,16));
		List<Interval> intervals=test.insert(list, new Interval(4,9));
		for(int i=0;i<intervals.size();i++)
			System.out.println(intervals.get(i).start+"   "+intervals.get(i).end);

	}

}
