package leet_code_codebase;

import java.util.*;

public class LongestSubstringWithoutRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		int ans = lengthOfLongestSubstring(s);
		System.out.println(ans);
		

	}
	
	public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        List<Character> ll =  new ArrayList<>();
        for(int i=0;i<s.length();){
            char ch = s.charAt(i);
            if(!ll.contains(ch)){
                ll.add(ch);
                ans = Math.max(ans,ll.size());
                i++;

            }
            else{
                ll.remove(0);
            }
        

        }
        return ans;

        
    }

}
