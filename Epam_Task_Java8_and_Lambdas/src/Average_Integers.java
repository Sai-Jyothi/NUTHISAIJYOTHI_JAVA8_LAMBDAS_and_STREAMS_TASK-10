import java.util.*;
public class Average_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers:");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" "+"integers to find average:");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			int num = sc.nextInt();
			arr.add(num);
		}
		
				System.out.println("The average of the list of integers is:\n"+average_method(n,arr));
	}
	
	public static double average_method(int n,ArrayList<Integer>arr)
	{
		
		double average = arr.stream().mapToDouble(i -> (double)i).average().getAsDouble();
		return average;
	}
	
	}

/*OUTPUT:
Enter the number of integers:
7
Enter 7 integers to find average:
11
13
49
63
81
36
16
The average of the list of integers is:
38.42857142857143


 
 */
