package Fourteen;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hash {
	
	public static String[] solution(String[] A) {
		int n = A.length;
		HashMap<String, Boolean> hashTable = new HashMap<String,Boolean>();
		
		List<String> result = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			
			    int length = A[i].length();
			    BigInteger twoToLengthPlus1 = BigInteger.ONE.shiftLeft(length + 1);
			    String b = twoToLengthPlus1.add(new BigInteger(A[i], 2).not()).toString(2);
			    b = b.substring(b.length() - length); 
			    
			    
			if (hashTable.containsKey(b)) {
				hashTable.put(b, true);
				result.add(b);
				result.add(A[i]);
				
			}
			else
				hashTable.put(A[i], false);
		}
		String[] str = new String[result.size()];
		 
        for (int i = 0; i < result.size(); i++) {
            str[i] = result.get(i);
        }
		return str;
	}
	
	
		public static void main(String args[])
		{
			String [] arr = {"1001","00110","11001","0110"};
			for(int i = 0 ; i < 4 ; i++) {
				
					System.out.println(solution(arr)[i]);
			}

		}
	}
