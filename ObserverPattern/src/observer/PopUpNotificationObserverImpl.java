package observer;

import observable.StockObservable;

public class PopUpNotificationObserverImpl implements NotificationObserver {

	private StockObservable observable;
	
	public PopUpNotificationObserverImpl(StockObservable observable) {
		this.observable=observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
      System.out.println("Notification via popUp: Iphone stock available "+ observable.getStocks());
      System.out.println("Book your Iphone hurry!!");
	}
}
