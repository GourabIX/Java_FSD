package day5.arrayList_examples;

import day5.beans.Student;
import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Gourab", "B.Tech", 22, "Kolkata");
		Student student2 = new Student(2, "Sudhanya", "B.E", 25, "Calcutta");
		Student student3 = new Student(3, "Dipankar", "B.Tech", 28, "Bardhaman");
		Student student4 = new Student(4, "Prince", "Economics", 24, "Gwalior");
		Student naru = new Student(5, "Naru", "Something", 72, "Somewhere");
		
		List<Student> studentList = new ArrayList<Student>(2);		// Creates an ArrayList collection of 2 elements.
		((ArrayList<Student>) studentList).ensureCapacity(7);		// All brackets mandatory. studentList can now hold 7 elements.
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		((ArrayList<Student>) studentList).trimToSize();			// Trims the ArrayList size to current capacity (3 elements).
		
		System.out.println("Number of elements in studentList: " + studentList.size());
		System.out.println("Is the list empty? " + studentList.isEmpty());
		System.out.println("Does the list contain Prince? " + studentList.contains(student4));		// takes object name as param
		System.out.println("Does the list contain Naru da? " + studentList.contains(naru));
		
		System.out.println("Index of student1? " + studentList.indexOf(student1));
		System.out.println("Index of naru? " + studentList.indexOf(naru));
		// also available: studentList.lastIndexOf(object)
		
		Object[] arr = new Student[5];			// Object is the superclass for all objects.
		arr = studentList.toArray();
		for(Object stud: arr)
		{
			System.out.println(stud);
		}
		
		System.out.println("Element at index 2: " + studentList.get(2).toString());

	}

}
