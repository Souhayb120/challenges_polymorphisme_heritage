package Challenge__8__Notifications;

public class PushNotification extends Notification{


    @Override
    public void envoyer(String message) {
        System.out.println("Push Notification !! ");
        System.out.println(message);
        System.out.println("************************");
        notificationList.add(this);
    };
    };

