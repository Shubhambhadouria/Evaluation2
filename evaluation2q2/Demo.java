package evaluation2q2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int nos = sc.nextInt();
		
		Student[] students = new Student[nos];
		
		for(int i=0; i<students.length; i++)
		{
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Roll");
			int roll = sc.nextInt();
			System.out.println("Enter Student Address");
			String address = sc.next();
			System.out.println("Enter Student Marks");
			int mar = sc.nextInt();
			
			System.out.println("Student name is : "+name+"\nStudent roll is :  "+roll+"\nStudent Address is : "+address+"\nStudent Marks is : "+mar);
			System.out.println("The average marks are : ");
		}
		
	}

}

