package Leetcode;

public class Test316 {
	
	public int count(int[] map){
		int count=0;
		for(int i=0;i<map.length;i++)
			if(map[i]!=0)
				count++;
		return count;
	}
	
	
	
	public String removeDuplicateLetters(String s) {
        if(s==null||s.length()<=1)
        	return s;
        char[] chas=s.toCharArray();
        int[] map=new int[26];
        for(int i=0;i<chas.length;i++)
        	map[chas[i]-'a']++;
        int length=count(map),index=-1;
        char[] res=new char[length];
        int[] exist=new int[26];
        char cur,top;
        for(int i=0;i<chas.length;i++){
        	cur=chas[i];
        	map[cur-'a']--;
        	if(exist[cur-'a']!=0)
        		continue;
        	while(index>=0){
        		top=res[index];
        		if(map[top-'a']>=1&&top>cur){
        			index--;
        			exist[top-'a']--;
        		}else
        			break;
        	}
        	exist[cur-'a']=1;
        	index++;
        	res[index]=cur;
        }
        return String.valueOf(res);
    }

	public static void main(String[] args) {
		Test316 test=new Test316();
		String s="abacb";
		System.out.println(test.removeDuplicateLetters(s));

	}

}
