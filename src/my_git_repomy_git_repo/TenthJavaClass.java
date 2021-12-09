package my_git_repomy_git_repo;



import java.util.Arrays;

public class TenthJavaClass {

	public static void main(String[] args) {
		
		// please find the biggest element in the given array
		 int [] array = {1,24,2,342,123,543,54,3,2};
		
		
		
		int max = array[0];
		 
		for( int eachElement : array) {
			
			
			if (max<= eachElement) {
				
			
				max = eachElement;
				
			}
		}
		 
		System.out.println(max);   // 543
		
		
	}
}
