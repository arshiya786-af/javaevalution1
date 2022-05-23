
package evaluation1;
import java.util.Scanner;

public class Bean {
//	private String rollnumber;
//	{System.out.println("====================================");}
//	
//	private String Studentname;
//	private String Marks;

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		String num= sc.nextLine();
		System.out.println("===============================");
		Scanner roll=new Scanner(System.in);
		System.out.println("Enter Rollno");
		String rollno= roll.nextLine();
		Scanner Name=new Scanner(System.in);
		System.out.println("Enter Name");
		String name= Name.nextLine();
		Scanner Marks=new Scanner(System.in);
		System.out.println("Enter Marks");
		String marks= Marks.nextLine();
		System.out.println("Student Detail: "+num);
		System.out.println("Student RollNo : "+roll);
		System.out.println("Student Name : "+Name);
		System.out.println("Student Marks :"+Marks);
		System.out.println("====================================");
		
		
		

	}

}
