package evaluation2q3;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3)
		{
			HatchBack h1 = new HatchBack();
			return h1;
		}
		else
		{
			Sedan s1 = new Sedan();
			return s1;
		}
	}
	
	public int calculateBill(Car car) {
		Car c1 = new Car();
		int nok = c1.getNumberOfKms();
		
//		Total fare=numberOfKms*farePerKm;
	}
}

