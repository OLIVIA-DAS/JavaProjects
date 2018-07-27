package com.deloitte.ex3;

	public class UserMainCode {

		public static boolean checktriplets(int[] arr) {
			int i;
			
			for(i=0;i<arr.length-2;i++) {
				if(arr[i]==arr[i+1] && arr[i]==arr[i+2])
				return true;
				else 
					continue;
			}
			return false;
		}


	}
