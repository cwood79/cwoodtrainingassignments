package student;
public class StudentSchedular {
	
	private Student[] students = new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber,String name, String[] courses)
	{
		
		if(findStudent(rollNumber)!=null)
		{
			return "Student not added, duplicate roll number";
		}
		else
		{
			students[counterStudent++]=new Student(rollNumber,name, courses);
			return "Student added successfully";
		}

		
	}
	
	public void showAllStudents()
	{
		
	}
	
	public void showAllStudentsByCourse(String course)
	{
		System.out.println("Students in course: "+course);
		for(int i=0; i<counterStudent; i++)
		{
			for(int j=0; j<students[i].getCourses().length; j++)
			{
				Student st=students[i];
				if(st.getCourses()[j].contentEquals(course))
				{
					System.out.println("Student: "+st.getName());
					System.out.println("Student roll number"+st.getRollNumber());
				}
			}
		}
	}
	
	public Student findStudent(int rollNumber)
	{
		
		for(int i=0; i<counterStudent; i++)
		{
			if(students[i].getRollNumber()==rollNumber)
			{
				return students[i];
			}
		}
		
		return null;
	}

}