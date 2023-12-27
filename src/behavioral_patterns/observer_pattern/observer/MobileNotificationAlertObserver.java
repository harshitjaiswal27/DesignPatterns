package behavioral_patterns.observer_pattern.observer;

import behavioral_patterns.observer_pattern.observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationAlertObserver{
    String mobileUser;
    StockObservable observable;

    public MobileNotificationAlertObserver(String mobileUser, StockObservable observable) {
        this.mobileUser = mobileUser;
        this.observable = observable;
    }

    @Override
    public void update(String message) {
        sendNotification(message,observable.getStockCount());
    }

    private void sendNotification(String message, int stockCount){
        System.out.println("Mobile Notification: "+mobileUser+" => "+message+" Stock Count:"+stockCount);
    }
}
