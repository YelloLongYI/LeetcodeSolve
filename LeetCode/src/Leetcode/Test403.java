package Leetcode;

import java.util.*;

public class Test403 {
	
	public HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	public boolean canCross(int[] stones,int dep,int preStep){
		if(dep==stones.length-1)
			return true;
		if(dep>=1&&preStep<=0)
			return false;
		int nextStone,nextIdx;
		for(int i=preStep-1;i<=preStep+1;i++){
			nextStone=stones[dep]+i;
			nextIdx=map.containsKey(nextStone)?map.get(nextStone):-1;
			if(nextIdx>0)
				if(canCross(stones,nextIdx,i)==true)
					return true;
		}
		return false;
	}
	
	public boolean canCross(int[] stones) {
		if(stones==null)
			return true;
		for(int i=0;i<stones.length;i++)
			map.put(stones[i], i);
        return canCross(stones,0,0);
    }
	
	public static void main(String[] args){
		Test403 test=new Test403();
		int[] stones=new int[]{0,1,2,3,4,8,9,11};
		System.out.println(test.canCross(stones));
	}
	
}
