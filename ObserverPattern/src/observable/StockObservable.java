package observable;

import observer.NotificationObserver;

public interface StockObservable {

	public void subscribe(NotificationObserver observer);
	
	public void unSubscribe(NotificationObserver observer);
	
	public void notifySubscribers();
	
	public void setStocks(int stock);
	
	public  int getStocks();
}
