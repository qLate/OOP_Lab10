package Task23;

import Task23.User.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MessageSender {
    public void send(String text, User user, Country country) {
        if (ChronoUnit.MINUTES.between(user.getLastActiveTime(), LocalDate.now()) > 60 || country != Country.Ukraine)
            return;
        user.sendTextMessage(text);
    }
}
