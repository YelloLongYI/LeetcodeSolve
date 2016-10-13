package Leetcode;

import java.util.*;



public class Test56 {
	
	
	public List<Interval> merge(List<Interval> intervals) {
		ArrayList<Interval> res=new ArrayList<Interval>();
		if(intervals==null||intervals.size()==0)
			return res;
        Collections.sort(intervals,new Comparator<Interval>(){
        	public int compare(Interval o1,Interval o2){
        		return o1.start==o2.start?0:o1.start<o2.start?-1:1;
        	}
        });
        Interval pre=null,next;
        Iterator<Interval> iter=intervals.iterator();
        if(!iter.hasNext())
        	return res;
        pre=iter.next();
        while(iter.hasNext()){
        	next=iter.next();
        	if(pre.end>=next.start){
        		pre.end=Math.max(pre.end,next.end);
        	}else{
        		res.add(pre);
        		pre=next;
        	}
        }
        res.add(pre);
        return res;
        
    }
	
	public static void main(String[] args){
		Test56 test=new Test56();
		List<Interval> intervals=new ArrayList<Interval>();
		intervals.add(new Interval(15,18));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(1,2));
		
		
		System.out.println(test.merge(intervals));
	}
	
}
