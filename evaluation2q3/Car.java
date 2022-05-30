package evaluation2q3;

public class Car {

	int numberOfPassenger;
	int numberOfKms;
	
	public Car() {
		super();
	}
	
	public Car(int numberOfPassenger, int numberOfKms) {
		super();
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}




//Create a Main class with main method inside this main method take the input from the
//user for the number of passengers and number of kms using the Scanner class and
//call bookCar method using appropriate arguments and use this returned object in the
//calculate bill method to calculate the total fare.
//
//Eg- main():
//
//public static void main(String[] args) {
//
//Scanner scanner = new Scanner(System.in);
//
////Write logic to get numberOfPassenger and numberOfKms
//
//Ola myOla = new Ola();
//Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
//int res = myOla.calculateBill(myCar);
//
//System.out.println("The total fare amount is"+ res);
//}