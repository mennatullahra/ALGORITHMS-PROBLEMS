package Fifteen;

import java.util.HashMap;
import java.util.Iterator;

public class Hash {
		static void rearrange(int arr[])
	    {
			/*
			 * 5 4 5 5 3 1 2 2 4
			 * */
			HashMap<Integer, Integer> hashTable = new HashMap<Integer,Integer>();
			Integer count= 0;
			for (int i = 0; i < arr.length; i++) {
				count = hashTable.get(arr[i]);
				if (count == null)
	                count = 0;
				hashTable.put(arr[i], count+1);
			}
			/*
			 * 5 1 -> 5 2 -> 5 3
			 * 4 1 -> 4 2
			 * 3 1
			 * 1 1
			 * 2 1 -> 2 2
			 * */
			for (int i = 0; i < arr.length; i++) {
				if (hashTable.get(arr[i]) != null) {
					count = hashTable.get(arr[i]);
					for (int j = 0; j < count; j++) {
						System.out.print(arr[i]+" ");
					}
					hashTable.remove(arr[i]);
				}
			}
	    }
	 
		
		public static void main(String args[])
		{
			int[] arr=new int[5000];
			for (int i = 0; i < arr.length /2; i++) {
				arr[i]=i;
			}
			for (int i = arr.length /2; i < arr.length; i++) {
				arr[i]=i-(arr.length /2);
			}
			int n = arr.length;
			
			try {
				//calculate time
				long startTime = System.currentTimeMillis();			
				rearrange(arr);			
				long endTime = System.currentTimeMillis();			
				System.out.println("hash took " + (endTime - startTime) + " milliseconds");
				
			} catch (Exception e) {
				System.err.println("Invalid input.");
			}
			

		}
	}


