package be.pxl.ja.oefening1;

public class WorkingPlaceUtility {

	public static <T extends Vehicle & Motorized> int getScore(WorkingPlace<T> workingPlace) {
		return workingPlace.getNumberOfThingsFixed();
	}
}
