package day9;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {

	public static void main(String[] args) {
		
		String filePath = "D:\\gs_61\\ecl_main\\java_trng\\src\\day9\\users.csv";
		
		try
		{
			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (bufferedReader.ready())
			{
				String currLine = bufferedReader.readLine();
				String[] personDetail = currLine.split(",");
				for(String currPersonDetail: personDetail)
				{
					System.out.println(currPersonDetail);
				}
				System.out.println();
			}
		}
		catch(Exception exc)
		{
			System.out.println("Exception occurred: " + exc);
		}

	}

}
