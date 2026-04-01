package programming_elements;

public class VolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radKm = 6378;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3) * pi * Math.pow(radKm, 3);
        double radiusMiles = radKm * 0.621371;
        double VolumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +" and cubic miles is " + VolumeMiles);
	}

}
