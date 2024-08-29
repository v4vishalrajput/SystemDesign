package Client;

import adaptee.DelhiTemprature;
import adapter.TempratureAdapter;
import adapter.TempratureAdapterImpl;

public class MainMethod {
	
public static void main(String[] args) {
	
	TempratureAdapter adapter = new TempratureAdapterImpl(new DelhiTemprature());
	
	double tempInF = adapter.getTempratureInFarenheit();
	
	System.out.println("Delhi's temprature is "+tempInF+"F");
}
}
