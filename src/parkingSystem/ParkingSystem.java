package parkingSystem;

public class ParkingSystem {
	private int[] spots;
	boolean isFree = false;

	public ParkingSystem(int small, int medium, int large) {
		spots = new int[] { small, medium, large };
	}

	public boolean addCar(int carType) {
		if (spots[carType - 1] > 0) {
			spots[carType - 1]--;
			return isFree= true;
		} else {
			return isFree;
		}
	}

	public int countSpace(int carType) {
		if (spots[carType - 1]>0) {
			spots[carType - 1]--;
			
			return spots[carType-1] + 1;
		}
		return 0;
	}
}
