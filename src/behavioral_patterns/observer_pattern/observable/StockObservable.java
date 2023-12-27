package behavioral_patterns.observer_pattern.observable;

import behavioral_patterns.observer_pattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int stockCount);
    public int getStockCount();
}
