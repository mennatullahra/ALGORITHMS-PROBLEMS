package Two;
import java.util.Scanner;

class PolicemenThieves {

	static int run(char arr[], int k, int n)
	{

		int P = -1;
		int T = -1; 
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'P') {
				P = i;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'T') {
				T = i;
				break;
			}
		}

		if (T<0 || P<0)
			return 0;

		while (P < n && T < n) {
			if (Math.abs(P-T) <= k) {
				P++;
				while (P < n && arr[P] != 'P')
					P++;
				T++;
				while (T < n && arr[T] != 'T')
					T++;
				count++;
			}

			else if (T < P) {
				T++;
				while (T < n && arr[T] != 'T')
					T++;
			}
			else {
				P++;
				while (P < n && arr[P] != 'P')
					P++;
			}
		}
		return count;
	}

	
	
	public static void main(String[] args)
	{
		while (true){
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("input N : ");
				int n = input.nextInt();
				
				System.out.println("input k : ");
				int k = input.nextInt();
				
				System.out.println("input characters : ");
				char arr1[] = input.next().toCharArray();
				
				System.out.println(run(arr1, k, n));
			} catch (Exception e) {
				System.err.println("Invalid input.");
				System.err.println("Enter data like this\n5\n1\n"
						+ "PTTPT\n");
			}
			
			
		}
	}
}
