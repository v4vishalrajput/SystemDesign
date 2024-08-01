package builder;

import product.Manual;

public class ManualBuilder implements Builder{

	private Manual manual;
	
	
	public ManualBuilder() {
		super();
		this.manual = new Manual();
	}

	@Override
	public ManualBuilder setVendor(String vendor) {
		// TODO Auto-generated method stub
		manual.setVendor(vendor);
		return this;
	}

	@Override
	public ManualBuilder setSeats(int seats) {
		// TODO Auto-generated method stub
		manual.setSeats(seats);
		return this;
	}

	@Override
	public ManualBuilder setModel(String model) {
		// TODO Auto-generated method stub
		manual.setModel(model);
		return this;
	}

	@Override
	public ManualBuilder setEngineCapacity(String engineCapacity) {
		// TODO Auto-generated method stub
		manual.setEngineCapacity(engineCapacity);
		return this;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		manual=new Manual();

}
	public Manual build() {
		return manual;
	}
}
