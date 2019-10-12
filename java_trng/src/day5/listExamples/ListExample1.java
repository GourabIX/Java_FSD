package day5.listExamples;

import java.util.List;
import day5.beans.Student;

public class ListExample1 {
	
	public static void displayStudentsList(List<Student> listOfStudents)
	{
		for(Student currStudent: listOfStudents)
		{
			System.out.println(currStudent.toString());
			System.out.println();
		}
	}
	
	public static void displayStudentBetweenAge(List<Student> listOfStudents, int startAge, int endAge)
	{
		int dispCount = 0;
		System.out.println("Students between the ages " + startAge + " and " + endAge);
		for (Student currStudent: listOfStudents)
		{
			if (currStudent.get_age() >= startAge && currStudent.get_age() <= endAge)
			{
				System.out.println(currStudent.toString());
				System.out.println();
				dispCount++;
			}
		}
		
		if (dispCount == 0)
			System.out.println("No Students meet the specified age criteria.");
	}
	
	public void displayStudentsFromCity(List<Student> listStudents, String city)
	{
		int dispCount = 0;
		System.out.println("\nStudents from city: " + city);
		for(Student curr_student: listStudents)
		{
			if (curr_student.get_cityOfBirth().equalsIgnoreCase(city))		// city is a String object. So, always use equals() method which follows OOP principles.
																			// Using == with String objects or any class objects is bad practice.
			{
				System.out.println(curr_student.toString());
				System.out.println();
				dispCount++;
			}
		}
		
		if (dispCount == 0)
			System.out.println("There are no students from " + city);
	}

}
