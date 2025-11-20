package Challenge__8__Notifications;

public class EmailNotification extends Notification{

@Override
    public void envoyer(String message){
    System.out.println("Email Notification !! ");
    System.out.println(message);
    System.out.println("************************");
    notificationList.add(this);
    }
}
