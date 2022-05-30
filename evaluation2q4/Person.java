package evaluation2q4;

public class Person {

	String name;
	String gender;
	Address address;
	
	
}




//Create a Main class with a following static method-
//public static Person generatePerson(Person person);
//
//Inside the main method of this Main class call the generatePerson() method with one
//object of the student and one object of the instructor class.
//
//And print the same with the help of overriding toString method.
//
//Note : Override toString method in all the classes.
//
//Eg- main():
//
//public static void main(String[] args) {
//
//Person newStudent = generatePerson(new Student());
//
//Person newTeacher = generatePerson(new Teacher());
//
//System.out.println(newStudent);
//System.out.println(newTeacher)
//}
//
//Sample OutPut:
//Student [studentId=1, courseFee=300000, courseEnrolled=JA111, address=Address
//[city=Chennai, state=TN, pincode=60001]]
//
//Instructor [instructorId =456, salary=45612, address=Address [city=Chennai,
//state=TN, pinCode=60001]]