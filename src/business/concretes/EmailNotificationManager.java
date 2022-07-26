package business.concretes;

import business.abstracts.NotificationService;
import entities.concretes.User;

public class EmailNotificationManager implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println(user.getEmail()+ ": Email notification");
    }
}
