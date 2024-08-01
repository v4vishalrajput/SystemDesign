package product;

public class Manual {
	private String vendor;

	private String seats;

	private String model;
	
	private String engineCapacity;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = "The cars vendor is "+vendor;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = "No. of seats in Car "+seats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = "Model of Car is "+model;
		
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = "Engine capacity of Car is "+engineCapacity;
	}

	@Override
	public String toString() {
		return "Manual [vendor=" + vendor + ", seats=" + seats + ", model=" + model + ", engineCapacity="
				+ engineCapacity + "]";
	}
	
	
	
}
