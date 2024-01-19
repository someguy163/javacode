package 상속;

public class SuperSonicAirPlaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperSonicAirPlane superSonicAirPlane = new SuperSonicAirPlane();
		
		superSonicAirPlane.takeOff();
		superSonicAirPlane.fly();
		superSonicAirPlane.flymode = superSonicAirPlane.SUPERSONIC;
		superSonicAirPlane.fly();
		superSonicAirPlane.flymode = superSonicAirPlane.NORMAL;
		superSonicAirPlane.fly();
		superSonicAirPlane.land();
		
	}

}
