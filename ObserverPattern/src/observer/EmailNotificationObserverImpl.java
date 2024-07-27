package observer;

import observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver {

	private StockObservable observable;
	
	public EmailNotificationObserverImpl(StockObservable observable) {
		this.observable=observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
      System.out.println("Notification via Email: Iphone stock available "+ observable.getStocks());
      System.out.println("Book your Iphone hurry!!");
	}

}
