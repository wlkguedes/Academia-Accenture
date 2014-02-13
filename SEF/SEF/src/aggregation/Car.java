package aggregation;
/**
 * @author Wilkie Guedes 
 *
 */
public class Car {
	
	private Engine engine;
	private Seat seat;
	private GasTank gasTank;
	
	public Car() {
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public GasTank getGasTank() {
		return gasTank;
	}

	public void setGasTank(GasTank gasTank) {
		this.gasTank = gasTank;
	}
	
	//corrigir
	
	public static void main(String[] args) {
		Engine engine = new Engine(12345);
		Seat seat = new Seat(1357);
		GasTank gasTank = new GasTank(2468);
		
		Car myCar = new Car();
		Car outherCar = new Car();
		
		myCar.setEngine(engine);
		myCar.setSeat(seat);
		myCar.setGasTank(gasTank);
		
		System.out.println("motor: "+myCar.getEngine().getSerialNumber()+", asento: "+myCar.getSeat().getSerialNumber()+ ", gas tank: "+myCar.getGasTank().getSerialNumber());
		
		myCar = null;
		
		outherCar.setEngine(engine);
		
		System.out.println("outher car recebeu o motor de my car: "+outherCar.getEngine().getSerialNumber());
	}
}