package builder;

public interface Builder {

	public Builder setVendor(String vendor);

	public Builder setSeats(int seats);

	public Builder setModel(String model);

	public Builder setEngineCapacity(String engineCapacity);

	public void reset();

}
