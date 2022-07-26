import business.concretes.EmailNotificationManager;
import business.concretes.SmsNotificationManager;
import business.concretes.UserManager;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user= new User(1,"Gülperi", "Çetin", "12345","cetingulperi0211@gmail.com");
        UserManager userManager = new UserManager(new EmailNotificationManager());
        UserManager userManager1 = new UserManager(new SmsNotificationManager());
        userManager.register(user);
        userManager1.register(user);
        userManager.forgotPassword(user);
    }
}
