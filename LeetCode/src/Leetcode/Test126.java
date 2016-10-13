package Leetcode;
import java.util.*;

public class Test126 {
	
	public boolean onedist(String s1,String s2)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)!=s2.charAt(i))
				count++;
		if(count==1)
			return true;
		else
			return false;
	}
	
	public void findpath(int[][] matrix,int visit,List<Integer> visited,List<String> arr,List<List<String>> result)
	{
		visited.add(visit);
		if(visit==(matrix[0].length-1))
		{
			List<String> temp=new ArrayList<String>();
			for(int i=0;i<visited.size();i++)
				temp.add(arr.get(visited.get(i)));
			result.add(new ArrayList<String>(temp));
			visited.remove(visited.size()-1);
			return;
		}
		for(int j=0;j<matrix[0].length;j++)
		{
			if(matrix[visit][j]==1&&!visited.contains(j))
			{
				findpath(matrix,j,visited,arr,result);
			}
		}
		if(visited.size()>0)
			visited.remove(visited.size()-1);
	}
	
    public List<List<String>> findLadders1(String beginWord, String endWord, Set<String> wordList) {
    	List<List<String>> result=new ArrayList<List<String>>();
        int[][] matrix=new int[wordList.size()+2][wordList.size()+2];
        List<String> arr=new ArrayList<String>();
        arr.add(beginWord);
        arr.addAll(wordList);
        arr.add(endWord);
        for(int i=0;i<matrix[0].length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        		if(onedist(arr.get(i),arr.get(j)))
        			matrix[i][j]=1;
        }
        List<Integer> visited=new ArrayList<Integer>();
        findpath(matrix,0,visited,arr,result);
        int min=0x7fffffff;
        List<List<String>> resultf=new ArrayList<List<String>>();
        for(int i=0;i<result.size();i++)       	
        {
        	if(result.get(i).size()<min)
        	{
        		resultf.clear();
        		min=result.get(i).size();
        	}
        	if(result.get(i).size()==min)
        	resultf.add(result.get(i));
        }
        return result;
        
    }
	
	
	public static void main(String[] args) {
		// Word Ladder II
		Test126 test=new Test126();
		Set<String> wordList=new HashSet<String>();
		String[] s=new String[]{"hot","dot","dog","lot","log"};
		wordList.addAll(Arrays.asList(s));
		test.findLadders1("hit", "cog", wordList);

	}

}
