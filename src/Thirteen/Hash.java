package Thirteen;
import java.util.*;
	
public class Hash {

		public static void findPairLoop(int[] arr, int n, int target)
	    {
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                    if (arr[i] + arr[j] == target) {
	                        //System.out.println(arr[i] +" " + arr[j]);
	                        found = true;
	                    }
	                
	            }
	        }
	 
	        if (found == false)
	            System.out.println("Not exist");
	    }
		
		public static void findPairHash(int[] arr, int n, int target) {
			HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				
				if(hashTable.containsKey(arr[i]))
					//System.out.println(arr[i]+" "+hashTable.get(arr[i]) );
					System.out.print("");
				else
					hashTable.put((target-arr[i]), arr[i]);
			}
		}
		
		public static void main(String args[])
		{
			//making an array to test the function
			int[] arr=new int[10000];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=i;
			}
			int n = arr.length;

			Scanner input = new Scanner(System.in) ;
			int x = input.nextInt();
			try {
				//calculate time
				long startTime = System.currentTimeMillis();
				findPairLoop(arr, n, x);			
				long endTime = System.currentTimeMillis();
				System.out.println("loops took " + (endTime - startTime) + " milliseconds");
				
				startTime = System.currentTimeMillis();			
				findPairHash(arr, n, x);			
				endTime = System.currentTimeMillis();			
				System.out.println("hash took " + (endTime - startTime) + " milliseconds");
			} catch (Exception e) {
				System.err.println("Invalid input.");
			}
			

		}
	}


