package day1;

public class test_add_mul extends Work {
	
	public static void main(String[] args)
	{
		Work obj = new Work();					// particularly effective if there are multiple methods that are required 
												// to be accessed across other un-inherited classes without using multilevel inheritance.
		System.out.println(obj.add(2, 3));
		
		System.out.println(add(5, 9));				// possible with extends
	}
}
