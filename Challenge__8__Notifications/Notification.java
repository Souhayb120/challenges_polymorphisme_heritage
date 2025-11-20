package Challenge__8__Notifications;

import java.util.ArrayList;
import java.util.List;


public class Notification {
protected List<Notification>notificationList;

public Notification(){
    this.notificationList = new ArrayList<>();
}

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
    }

    public void envoyer(String message){

    }

    public void notifierTous(List<Notification> liste, String msg){
    for(Notification notification : liste){
        notification.envoyer(msg);
    }
    }


}
