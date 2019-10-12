package zs_gs_java;
import java.lang.*;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "@";
		try {
			int var = Integer.parseInt(s);
			System.out.println("not str");
		}
		catch (NumberFormatException e)
		{
			System.out.println("str");
		}
	}

}
