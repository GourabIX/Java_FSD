package day2.arrays;

public class Multi_dimensional_arrays {
	
	public static void main(String[] args)
	{
		int md_arr[][] = {{1, 2, 3, 4}, {5, 6, 7}};
		
		System.out.println("Here's the multi-dimensional array: ");
		for(int i = 0; i < md_arr.length; i++)
		{
			for(int j = 0; j < md_arr[i].length; j++)
			{
				System.out.println(md_arr[i][j]);
			}
		}
		
		System.out.println("Element at index (1, 2) = " + md_arr[1][2]);
	}

}
