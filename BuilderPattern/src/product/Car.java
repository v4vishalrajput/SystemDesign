package product;

public class Car {
	
	private String vendor;

	private int seats;

	private String model;
	
	private String engineCapacity;
	
	private String owner;

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [vendor=" + vendor + ", seats=" + seats + ", model=" + model + ", engineCapacity=" + engineCapacity
				+ ", owner=" + owner + "]";
	}
	
	

}
