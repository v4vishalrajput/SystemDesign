package adapter;

import adaptee.Temprature;

public class TempratureAdapterImpl implements TempratureAdapter{
	
	private Temprature delhiTemprature;
	 

	public TempratureAdapterImpl(Temprature delhiTemprature) {
		super();
		this.delhiTemprature = delhiTemprature;
	}


	@Override
	public double getTempratureInFarenheit() {
		// TODO Auto-generated method stub
		double tempInCelcius = delhiTemprature.getTempratureInCelcius();
		return (9.0/5)*tempInCelcius + 32;
	}
	

}
