package be.pxl.ja.oefening1;

public class TestWorkingPlace {

	public static void main(String[] args) {
		Car car = new Car();
		CircularSaw circularSaw = new CircularSaw();
		Bike bike = new Bike();

        WorkingPlace<Car> workingPlace = new WorkingPlace<>();

        workingPlace.startFixing(car);
        workingPlace.finished();
        System.out.println(workingPlace.getNumberOfThingsFixed());
        System.out.println(WorkingPlaceUtility.getScore(workingPlace));
	}
}
