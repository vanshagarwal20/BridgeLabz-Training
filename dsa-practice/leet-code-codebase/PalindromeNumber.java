package leet_code_codebase;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121;
		System.out.println(x);

	}
	
	public static boolean isPalindrome(int x) {
        int n = x;
        if(x<0){
            return false;
        }
        int rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        return rev==n ? true:false;
        
    }

}
