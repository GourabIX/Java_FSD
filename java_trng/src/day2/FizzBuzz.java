package day2;

public class FizzBuzz {
	
	public static void main(String[] args)
	{
		System.out.println("The FizzBuzz test: \n");
		for(int i = 0; i <= 100; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
	}

}
