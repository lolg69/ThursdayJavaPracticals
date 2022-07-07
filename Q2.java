import java.util.Scanner;

class StudentPortal{
	public static void main(String[] args){
		Scanner s = new Scanner();
		
		String name = s.nextLine();
		System.out.println("Student name:" +name);
		
		String address = s.nextLine();
		System.out.println("Student address:" +address);

		int number= s.nextLine();
		System.out.println("Student Number:" +number);

		String gender = s.nextLine();
		System.out.println("Student gender:" +gender);

		String DOB = s.nextLine();
		System.out.println("Student Date of birth:" +DOB);	

		int height = s.nextLine();
		System.out.println("Student height:" +height);

		int weight = s.nextLine();
		System.out.println("Student weight:" +weight);

		String degree = s.nextLine();
		System.out.println("Student degree:" +degree);
		
		int year = s.nextLine();
		System.out.println("Student year:" +year);

		double CGPA = s.nextLine();
		System.out.println("Student CGPA:" +CGPA);

		boolean tution = s.nextLine();
		System.out.println("Student tution:" +Tution);

		boolean scholar = s.nextLine();
		System.out.println("Student scholar:" +scholar);

		int id = s.nextLine();
		System.out.println("Student id:" +id);
	}
	
}