package com.surya.searchalgo;

public class BianrySearch {
//	int low =0;
//	int high=a.length;
	static int a[];
//	int elem;
	public void getArray(int[] a)
	{
		BianrySearch.a=a;
	}
	
 public int binarySearch(int low,int high,int elem)
 {
	 int mid=(low+high)/2;
	 
	 if(low>high)
	 {
		
		 return 101;
	 }
	 
	 if (elem==a[mid])
	 {
		 return mid;
	 }
	 else if(elem>a[mid])
	 {
		 return binarySearch(mid+1,high,elem);
	 }
	 else
	 {
		 return binarySearch(low, mid-1, elem);
	 }
 }
}
