package Leetcode;
import java.util.*;

public class Test127 {
	
	public boolean isOneDiff(String s1,String s2){
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				count++;
		}
		return count==1;
	}
	
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		if(beginWord==null||endWord==null||beginWord.equals(endWord))
			return 0;
		if(isOneDiff(beginWord,endWord))
			return 2;
		HashMap<String,Integer> dist=new HashMap<String,Integer>();
		Queue<String> queue=new LinkedList<String>();
		String temp,head;
		int num;
		queue.add(beginWord);
		dist.put(beginWord, 1);
		while(!queue.isEmpty()){
			head=queue.poll();
			num=dist.get(head);
			StringBuilder sb=new StringBuilder(head);
			for(int i=0;i<head.length();i++){
				char t=sb.charAt(i);
				for(char j='a';j<='z';j++){
					if(head.charAt(i)==j)
						continue;		
					sb.setCharAt(i, j);				
					if(wordList.contains(sb.toString())&&!dist.containsKey(sb.toString()))
					{
						dist.put(sb.toString(), num+1);
						queue.add(sb.toString());
						wordList.remove(sb.toString());
					}
					
					if(sb.toString().equals(endWord)) return num+1;
				}
				sb.setCharAt(i, t);
			}
			
		}
        return 0;
    }

	public static void main(String[] args) {
		Test127 test=new Test127();
		String s1="hit",s2="cog";
		Set<String> set=new HashSet<String>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		System.out.println(test.ladderLength(s1, s2, set));

	}

}
