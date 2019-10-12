package zs_gs_java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.lang.*;

public class Java_cheat_sheet {
	
	private static int ch_id;
	private static long date_cr;
	private static String loc;
	private static double get_rand;
	
	public Java_cheat_sheet(int ch_id, long date, String loc)
	{
		System.out.println("Enter CheatSheet ID, date, and location: ");
		Scanner sc = new Scanner(System.in);
		this.ch_id = sc.nextInt();
		this.date_cr = sc.nextLong();
		this.loc = sc.next();
		get_rand = Math.random() * 1000;
		sc.close();
	}
	
	public static int getid()
	{
		return ch_id;
	}
	
	public static long get_date()
	{
		return date_cr;
	}
	
	public static String get_loc()
	{
		return loc;
	}
	
	public static void set_id(int id)
	{
		ch_id = id;
	}
	
	public static void set_date(long date)
	{
		date_cr = date;
	}
	
	public static void set_loc(String str)
	{
		loc = str;
	}
	
	public static double get_random()
	{
		return get_rand;
	}
	
	public static void display()
	{
		System.out.println("ID: " + ch_id + "\nDate: " + date_cr + "\nLocation: " + loc + "\nRandom number: " + get_rand);
	}
	
	private static int sum(int num1, int num2)			// If we don't use static, we'll be only able to access these functions with objects.
	{
		return num1 + num2;
	}
	
	private static void just_a_func()				// Accessible normally
	{
		System.out.println("This is a non-static function");
	}
	
	void another_func()				// Accessible with objects
	{
		System.out.println("This is a non-static function with no access specifier.");
	}
	
	public static void main(String[] args)
	{
		// The EXTREME BASICS ***********************************************************

		System.out.println("Hello again old friend!");
		String a = "45";
		int some_num = Integer.parseInt(a);
		System.out.println(some_num);
		String b = "58.96";
		int some_flt = (int) Float.parseFloat(b);
		System.out.println(some_flt);
				
		int x = Integer.parseInt("7A", 16);			// 16 is the radix / base.
		System.out.println(x);
		String y = Integer.toString(122, 16);
		System.out.println(y);
				
		Scanner sc = new Scanner(System.in);
		int in1 = sc.nextInt();
		float in2 = sc.nextFloat();
		double in3 = sc.nextDouble();
		String s1 = sc.nextLine();
		System.err.println("System.err.print does not have new Lines. Also this dumps only after all remaining print statements upto the end of the file has finished.");
		System.out.println("System.out.println has.");
		System.out.println("This goes to show what's written above.");
		System.out.println(in1 + "\t" + in2 + "\t" + in3 + "\t" + s1);
		System.out.println("No" + "whitespaces in between");
		
		String str = "This is a string of length ";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.substring(0, 3));		// end_index is not inclusive.
		System.out.println(str.equals("This is a string of length "));
		System.out.println(str.contains(str.substring(5, 9)));
		System.out.println(str.startsWith("This"));
		System.out.println(str.endsWith(" "));
		System.out.println(str.indexOf(3));
		System.out.println(str.indexOf(str.substring(1, 7)));
		System.out.println(str.indexOf('s'));
		String f_name = "Gourab";
		String l_name = "Sarkar";
		System.out.println(f_name.compareTo(l_name));		// The result is a negative integer if this String object lexicographically precedes the argument string.
															// The result is a positive integer if this String object lexicographically follows the argument string.
															// The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true. 
		String str2 = "This is another string of length ";
		str2.replaceAll("length", "size");
		System.out.println(str2);
		
		String[] str_arr = str2.split(" ");			// Creates an array of strings; splits on whitespace.
		System.out.println(str_arr);				// Will print package name of data type of array elements followed by mem_addr
		for(String s: str_arr)
		{
			System.out.println(s);
		}
		
		double num = -59.2568;
		double num2 = 98.87784;
		System.out.println(Math.abs(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.log10(num));
		System.out.println(Math.round(num));
		System.out.println(Math.max(num, num2));
		System.out.println(Math.min(num, num2));
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.random());
		
		// CONDITIONALS ****************************************************************
		
		boolean cond1 = false;
		boolean cond2 = false;
		if (cond1)
		{
			System.out.println("I suck at social interactions.");
		}
		else if (cond2)
		{
			System.out.println("Life's not great right now.");
		}
		else
		{
			System.out.println("The storm... It's not over yet.");
		}
		
		// LOOPS **********************************************************************
		
		int ct = 0;
		while (ct < 5)
		{
			int in_var = 0;
			System.out.println("Enter number " + (ct + 1) + " : ");
			in_var = sc.nextInt();
			System.out.println("Entered " + in_var);
			ct++;
		}
		
		for(int i = 0; i < 5; i++)									// Normal for loop
		{
			System.out.println("Count: " + (i + 1));
			if(i == 3)
				break;
			else
				continue;
		}
		
		String my_str[] = {"Life ", " is ", " Strange"};
		for(String z: my_str)										// Enhanced for loop; also called foreach loop
		{
			System.out.println(z);									
		}
		
		int do_ct = 0;
		do
		{
			System.out.println("This is iteration " + (do_ct + 1));
			do_ct++;
			if (do_ct == 2)
				break;
			continue;
		}while(do_ct <= 5);
		
		int some_nums[] = new int[10];			// a dynamic array called some_nums of length 10 has been created in heap.
		
		// The new operator instantiates a class by dynamically allocating (i.e, allocation at run time) memory for a new object
		// and returning a reference to that memory. This reference is then stored in the variable. 
		// Thus, in Java, all class objects must be dynamically allocated.
		
		System.out.println("Length of some_nums array: " + some_nums.length);
		for (int i = 0; i < some_nums.length; i++)
		{
			System.out.println("Enter number " + (i + 1));
			some_nums[i] = sc.nextInt();
		}
		
		for(int x1: some_nums)
		{
			System.out.print(x1 + "\t");
		}
		
		// Other methods to create arrays:
		// int arr_x[][] = new int[5][5];			// creates a 5x5 matrix array.
		// int arr_y[] = {1, 2, 3, 4, 5};
		// String arr[] = new String[10];
		
		int ragged_xy[][] = {{1, 2}, {3, 4, 5, 6, 7}};			// this is called a ragged array.
		System.out.println("Here's the contents of the ragged array: ");
		for(int i = 0; i < ragged_xy.length; i++)
		{
			for (int j = 0; j < ragged_xy[i].length; j++)
			{
				System.out.println(ragged_xy[i][j]);
			}
		}
		
		System.out.println("The sum of 2 and 3 is: " + sum(2, 3));
		System.out.println("Sum of 2 and 33: " + Integer.sum(2, 33));
		just_a_func();
		// another_func();
		
		Java_cheat_sheet obj1 = new Java_cheat_sheet(4, 30082019, "Zensar");
		System.out.println(obj1.getid());
		System.out.println(obj1.get_date());
		System.out.println(obj1.get_loc());
		System.out.println(obj1.get_random());
		obj1.set_id(9);
		System.out.println(obj1.getid());
		obj1.display();
		
		try
		{
			int fail = 50 / 0;
		}
		catch (ArithmeticException exc)			// catch() is a function that takes an argument which specifies the exception that
												// could occur. A variable which refers to the exception type is also separated by space
												// after the exception type.
		{
			System.out.println(exc);
		}
		finally
		{
			System.out.println("Division by zero is not allowed.");
		}
		
		try
		{
			int fail2 = 50 / 0;
		}
		catch (Exception exc_all)				// catches all types of exceptions
		{
			System.out.println(exc_all);
			if (exc_all instanceof IOException)
			{
				System.out.println("IO Exception detected!");
			}
			else if (exc_all instanceof ArithmeticException)
			{
				System.out.println("Arithmetic Exception detected!");
			}
		}
		finally
		{
			System.out.println("Exception detected!");
		}
		
		try
		{
			// throw new ArrayIndexOutOfBoundsException();
			// throw new IndexOutOfBoundsException();
			throw new Exception("Custom Exception message!");
		}
		catch (Exception exc_all)
		{
			System.out.println(exc_all);
		}
		finally
		{
			// do nothing.
		}
		
		Test_Exception exc_obj = new Test_Exception();
		
		try 
		{
			exc_obj.test_exc();
		}
		catch (Exception exc)
		{
			System.out.println(exc);
		}
		finally
		{
			System.out.println("Normal Exception flow!");
		}
		
		ArrayList<String> flowerList = new ArrayList<String>();
		
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		ArrayList<String> flowerListClone = (ArrayList<String>) flowerList.clone();
		
		System.out.println(flowerListClone);
		
	}
}
