public class ConvertibleCar extends Car implements ICar{
	private boolean isLowered;
	private boolean isRaised;
	private boolean IsStarted;

	public ConvertibleCar(String model, IEngine engine, ElectronicIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}

	public boolean getIsStarted() {
		return this.IsStarted=true;	
	}

	public boolean raiseRoof() {
		return this.isRaised = true;
	}

	public boolean lowerRoof() {
		return this.isLowered=true;
	}
}