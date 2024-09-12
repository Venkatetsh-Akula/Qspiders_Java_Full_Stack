package com.dupproject;
import java.util.ArrayList;
public class DummyProject{
	public static void demo(int[] arr,ArrayList<Integer> ans,int tar,int val) {
		if(val>tar) {
			return;
		}
		else if(val==tar) {
			new ArrayList(ans); 
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {1, 1, 2, 5, 6, 7, 10};
		ArrayList<Integer> ans=new ArrayList<>();
		int target=8;
		demo(arr,ans,target,0);
	}
}