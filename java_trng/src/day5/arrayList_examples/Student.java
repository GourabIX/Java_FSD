package day5.arrayList_examples;

public class Student {
	
	private int rollNo;
	private String studentName;
	private String course;
	private int age;
	private String cityOfBirth;
	
	public Student()
	{
		// do something
		System.out.println();
	}
	
	public Student(int rollNo, String studentName, String course, int age, String cityOfBirth)
	{
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.course = course;
		this.age = age;
		this.cityOfBirth = cityOfBirth;
	}
	
	public void set_rollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	
	public int get_rollNo()
	{
		return this.rollNo;
	}
	
	public void set_studentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public String get_studentName()
	{
		return this.studentName;
	}
	
	public void set_course(String course)
	{
		this.course = course;
	}
	
	public String get_course()
	{
		return this.course;
	}
	
	public void set_age(int age)
	{
		this.age = age;
	}
	
	public int get_age()
	{
		return age;
	}
	
	public void set_cityOfBirth(String cityOfBirth)
	{
		this.cityOfBirth = cityOfBirth;
	}
	
	public String get_cityOfBirth()
	{
		return cityOfBirth;
	}
	
	@Override
	public String toString()
	{
		return "Student Details: \n Name: " + studentName + "\n Roll: " + rollNo + "\n Course: " + course + "\n Age: " + age + "\n City Of Birth: " + cityOfBirth;
	}

}
