package br.alvaro.factoryCriacional;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
