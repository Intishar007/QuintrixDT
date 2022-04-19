import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();
		
		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String model = car.getModel();

		assertEquals(model, Car.getModel() , "The car models should be same!");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "Convertible didn't start!");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		
		boolean isLower= car.lowerRoof();
		
		assertTrue(isLower,"The car should be able to lower the roof!");
		
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;
		
		boolean isRaised= car.raiseRoof();
		
		assertTrue(isRaised,"The car should be able to raise the roof!");

	}
}