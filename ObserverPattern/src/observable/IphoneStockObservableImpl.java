package observable;

import java.util.ArrayList;
import java.util.List;

import observer.NotificationObserver;

public class IphoneStockObservableImpl implements StockObservable {
    
	private List<NotificationObserver> subscribers;
	
	private int iphoneStocks=0;
	
	public IphoneStockObservableImpl() {
		subscribers=new ArrayList<>();
		this.iphoneStocks=0;
	}
	
	@Override
	public void subscribe(NotificationObserver observer) {
		// TODO Auto-generated method stub
		this.subscribers.add(observer);
	}

	@Override
	public void unSubscribe(NotificationObserver observer) {
		// TODO Auto-generated method stub
		this.subscribers.remove(observer);
	}

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationObserver subscriber :  subscribers) {
			subscriber.update();
		}
	}

	@Override
	public void setStocks(int stock) {
		// TODO Auto-generated method stub
		if(this.iphoneStocks==0 && this.iphoneStocks+stock>0) {
			this.iphoneStocks+=stock;
			this.notifySubscribers();
		}
	}

	@Override
	public int getStocks() {
		// TODO Auto-generated method stub
		return this.iphoneStocks;
	}



}
