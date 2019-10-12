package day5.listExamples;

import java.util.ArrayList;
import java.util.List;

import day5.beans.Student;

public class TestListExample1 {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Gourab", "B.Tech", 22, "Kolkata");
		Student student2 = new Student(2, "Sudhanya", "B.E", 25, "Calcutta");
		Student student3 = new Student(3, "Dipankar", "B.Tech", 28, "Bardhaman");

		List<Student> listOfStudents = new ArrayList<Student>(); 	// List<Student> simply implies that it's a DS storing "Student" class objects.
																	// This is an example of Interface oriented programming.
																	// List is an interface which is implemented by the ArrayList class.
																	// Interface oriented programming is recommended.
																	// This creates an ArrayList of size 10 because size is not specified.
		
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);

		ListExample1.displayStudentsList(listOfStudents);
		ListExample1.displayStudentBetweenAge(listOfStudents, 10, 20);
		
		// Non-static methods can only be called by creating objects for them.
		ListExample1 methodCall = new ListExample1();
		methodCall.displayStudentsFromCity(listOfStudents, "KOLKATA");

	}

}
