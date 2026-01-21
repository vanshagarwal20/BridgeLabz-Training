package leet_code_codebase;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123;
		System.out.println(reverse(x));
	}
	public static int reverse(int x) {
        long ans = 0;
        while(x!=0){
            int rem = x%10;
            ans += rem;
            ans = ans*10;
            x=x/10;
        }
        ans = ans/10;
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*ans);
        }
        return (int)ans;
    }

}
