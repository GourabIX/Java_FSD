package day2;

public class Numbers {
	
	public static void main(String[] args)
	{
		System.out.println("All numbers: ");
		for(int i = 0; i <= 20; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Even numbers: ");
		for(int i = 0; i <= 20; i++)
		{
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

}
