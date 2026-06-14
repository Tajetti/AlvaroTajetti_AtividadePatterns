package br.alvaro.factoryCriacional;

public class Main {
    public static void main(String[] args) {
        String message = "Bem-vindo ao sistema!";

        NotificationService emailService =
                new NotificationService(new EmailNotificationFactory());
        emailService.sendNotification(message);

        NotificationService smsService =
                new NotificationService(new SMSNotificationFactory());
        smsService.sendNotification(message);

        NotificationService pushService =
                new NotificationService(new PushNotificationFactory());
        pushService.sendNotification(message);
    }
}
