package main;

import observable.IphoneStockObservableImpl;
import observable.StockObservable;
import observer.EmailNotificationObserverImpl;
import observer.NotificationObserver;
import observer.PopUpNotificationObserverImpl;

public class MainMethod {
   public static void main(String [] args) {
	   StockObservable observable=new IphoneStockObservableImpl();
	   
	   NotificationObserver emailObs=new EmailNotificationObserverImpl(observable);
	   NotificationObserver popUpObs=new PopUpNotificationObserverImpl(observable);
	   
	   observable.subscribe(emailObs);
	   observable.subscribe(popUpObs);
	   
	   observable.setStocks(12);
   }
}
