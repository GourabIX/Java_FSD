package day1;

public class Work {
	
	public static int add(int x, int y)
	{
		return x + y;
	}
	
	public static int mul(int x, int y)
	{
		return x * y;
	}
	
	public static void main(String[] args)
	{
		int age = 17;
		if (age > 18)
			System.out.println("Can't vote");
		else
			System.out.println("Can vote");
		
		System.out.println(add(20, 30));
		System.out.println(mul(20, 30));
	}
}
