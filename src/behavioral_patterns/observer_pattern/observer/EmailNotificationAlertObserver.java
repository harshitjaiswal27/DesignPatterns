package behavioral_patterns.observer_pattern.observer;

import behavioral_patterns.observer_pattern.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable stockObservable;

    public EmailNotificationAlertObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update(String message) {
        sendEmail(message, stockObservable.getStockCount());
    }

    private void sendEmail(String message, int stockCount){
        System.out.println("Email Alert: "+email+" => "+message+" Stock Count:"+stockCount);
    }
}
