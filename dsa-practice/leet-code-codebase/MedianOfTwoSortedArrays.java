package leet_code_codebase;

import java.util.*;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,3};
		int [] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1,nums2));
		

	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            ll.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            ll.add(nums2[i]);
        }
        Collections.sort(ll);
        int u = ll.size()/2;
        if(ll.size()%2==0){
            return (double)(ll.get(u)+ll.get(u-1))/2;
        }
        else
        return ll.get(u);
    }

}
