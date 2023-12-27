package behavioral_patterns.observer_pattern.observable;


import behavioral_patterns.observer_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.*;

public class IphoneStockObservable implements StockObservable{
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observers)
            observer.update("IPhone Stock is back!");
    }

    @Override
    public void setStockCount(int stockCount) {
        boolean notify = false;
        if(this.stockCount==0)
            notify = true;
        this.stockCount=stockCount;
        if(notify)
            notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
