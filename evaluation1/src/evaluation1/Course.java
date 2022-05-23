package evaluation1;

public class Course {
	public static void main(String args[])
	{
		Course d = new Course ();
		d.Authorization("Admin","1234");
		d.Authorization("Masai","1274");

				
		
}
	public void DisplayCourseDetails(int in,String ch,int inr) {
		System.out.println("CourseId :"+in);
		System.out.println("CourseName :"+in);
		System.out.println("CourseFee: "+inr);
	}
public void Authorization(String user,String pass)
{
	if(user=="Admin"&&pass=="1234")
	{
		DisplayCourseDetails(120,"java",2300);
	}
	else
	{
		System.out.println("Invalid Username or password");
	}
}
}
