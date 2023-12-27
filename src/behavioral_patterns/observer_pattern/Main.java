package behavioral_patterns.observer_pattern;

import behavioral_patterns.observer_pattern.observable.IphoneStockObservable;
import behavioral_patterns.observer_pattern.observable.MacBookStockObservable;
import behavioral_patterns.observer_pattern.observable.StockObservable;
import behavioral_patterns.observer_pattern.observer.EmailNotificationAlertObserver;
import behavioral_patterns.observer_pattern.observer.MobileNotificationAlertObserver;
import behavioral_patterns.observer_pattern.observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        StockObservable macbookStockObservable = new MacBookStockObservable();
        NotificationAlertObserver observer1 = new EmailNotificationAlertObserver("observer1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationAlertObserver("observer2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileNotificationAlertObserver("observer3", iphoneStockObservable);
        NotificationAlertObserver observer4 = new MobileNotificationAlertObserver("observer4", macbookStockObservable);
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        macbookStockObservable.add(observer4);
        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(20);
        macbookStockObservable.setStockCount(30);
        macbookStockObservable.setStockCount(0);
        macbookStockObservable.setStockCount(50);
    }
}