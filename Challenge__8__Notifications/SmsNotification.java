package Challenge__8__Notifications;

public class SmsNotification extends Notification{


    @Override
    public void envoyer(String message){
        System.out.println("SmS Notification !! ");
        System.out.println(message);
        System.out.println("************************");
        notificationList.add(this);
    }
}
