package com.surya.searchalgo;



public class Runner {
	public static void main(String [] args)
	{
		int [] a= {1,2,3,4,5,6,99,888};
		BianrySearch b=new BianrySearch();
		b.getArray(a);
		System.out.println(b.binarySearch(0, a.length,888));
	}
}
