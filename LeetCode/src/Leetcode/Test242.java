package Leetcode;
import java.util.*;

public class Test242 {
	
//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())
//        	return false;
//        HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
//        HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
//        char[] a=s.toCharArray();
//        char[] b=t.toCharArray();
//        for(int i=0;i<a.length;i++)
//        {
//        	if(map1.containsKey(a[i]))
//        		map1.put(a[i], map1.get(a[i])+1);
//        	else
//        		map1.put(a[i], 1);
//        	if(map2.containsKey(b[i]))
//        		map2.put(b[i], map2.get(b[i])+1);
//        	else
//        		map2.put(b[i], 1);
//        }
//        char temp;
//        Iterator<Character> iter1=map1.keySet().iterator();
//        Iterator<Character> iter2=map2.keySet().iterator();
//        while(iter1.hasNext()&&iter2.hasNext())
//        {
//        	temp=iter1.next();
//        	iter2.next();
//        	if(!map2.containsKey(temp))
//        		return false;
//        	
//        	if(map1.get(temp)!=map2.get(temp))
//        		return false;
//        }
//        if(!iter1.hasNext()&&!iter2.hasNext())
//        	return true;
//        return false;
//    }
	
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		char[] a=s.toCharArray();
		char[] b=t.toCharArray();
		int[] array1=new int[26];
		int[] array2=new int[26];
		for(int i=0;i<a.length;i++)
		{
			array1[a[i]-'a']++;
			array2[b[i]-'a']++;
		}
		for(int i=0;i<26;i++)
			if(array1[i]!=array2[i]	)
				return false;
		return true;
	}

	public static void main(String[] args) {
		//Valid Anagram
		Test242 test=new Test242();
		System.out.println(test.isAnagram("aaabbbccc", "bacbaccab"));

	}

}
