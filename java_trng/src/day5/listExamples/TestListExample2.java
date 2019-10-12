package day5.listExamples;

import java.util.Vector;
import java.util.List;

import day5.beans.Student;

public class TestListExample2 {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Gourab", "B.Tech", 22, "Kolkata");
		Student student2 = new Student(2, "Sudhanya", "B.E", 25, "Calcutta");
		Student student3 = new Student(3, "Dipankar", "B.Tech", 28, "Bardhaman");

		List<Student> listOfStudents = new Vector<Student>();

		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);

		ListExample1.displayStudentsList(listOfStudents);
		ListExample1.displayStudentBetweenAge(listOfStudents, 10, 30);
		
		// Non-static methods can only be called by creating objects for them.
		ListExample1 methodCall = new ListExample1();
		methodCall.displayStudentsFromCity(listOfStudents, "Calcutta");

	}

}
