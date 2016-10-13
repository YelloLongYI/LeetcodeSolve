package Leetcode;
import java.util.*;

public class Test36 {
	
	public boolean rowvalid(char[][] a,int row)
	{
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<9;i++)
			if(set.contains(a[row][i])&&a[row][i]!='.')
				return false;
			else
				set.add(a[row][i]);
		return true;
	}
	
	public boolean columvalid(char[][] a,int colum)
	{
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<9;i++)
			if(set.contains(a[i][colum])&&a[i][colum]!='.')
				return false;
			else
				set.add(a[i][colum]);
		return true;
	}
	
	public boolean clunkvalid(char[][] a,int row,int colum)
	{
		HashSet<Character> set=new HashSet<Character>();
		int row1=row/3,colum1=colum/3;
		for(int i=row1*3;i<(row1+1)*3;i++)
			for(int j=colum1*3;j<(colum1+1)*3;j++)
				if(set.contains(a[i][j])&&a[i][j]!='.')
					return false;
				else
					set.add(a[i][j]);
		return true;
				
	}
	
	public boolean isvalid(char[][] a,int row,int colum)
	{
		return rowvalid(a,row)&&columvalid(a,colum)&&clunkvalid(a,row,colum);
	}
	
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        	if(rowvalid(board,i)==false)
        		return false;
        for(int j=0;j<9;j++)
        	if(columvalid(board,j)==false)
        		return false;
        for(int i=0;i<9;i=i+3)
        	for(int j=0;j<9;j=j+3)
        		if(clunkvalid(board,i,j)==false)
        			return false;
        return true;
        
//        int row=0,colum=0;
//        while(row!=-1)
//        {
//        	while(board[row][colum]!='.')
//        	{
//        		colum++;
//        		if(colum>=9)
//        			break;
//        	}
//        	if(colum<9)
//        	{
//        		if(temp[row][colum]=='.')
//        			temp[row][colum]='1';
//        		else
//        			temp[row][colum]=(char)(temp[row][colum]+1);
//        		if(temp[row][colum]==58)
//        		{
//        			temp[row][colum]='.';
//        		}
//        	}
//        	else
//        	{
//        		colum=0;
//        		row++;
//        		if(row>=9)
//        			return true;
//        	}
//        	
//        }
//        return false;
    }

	public static void main(String[] args) {
		//Valid Sudoku
		Test36 test=new Test36();
		char[][] a=new char[][]{{'1','2','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}};
		System.out.println(test.isValidSudoku(a));

	}

}

