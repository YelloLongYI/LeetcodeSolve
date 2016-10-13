package Leetcode;

public class Test372 {
	
	int mod=1337;
	
	public int pow(int a,int exp){
		int res=1;
		for(int i=1;i<=exp;i++){
			res=((a%mod)*(res%mod))%mod;
		}
		return res;
	}
	
	public int superPow(int a, int[] b) {
        int res=1;
        for(int i=0;i<b.length;i++){
        	res=((pow(res, 10)%mod)*(pow(a, b[i])%mod))%mod;
        }
        return res;
    }

	public static void main(String[] args) {
		Test372 test=new Test372();
		int[] b=new int[]{1,1};
		System.out.println(test.superPow(2, b));
	}

}
