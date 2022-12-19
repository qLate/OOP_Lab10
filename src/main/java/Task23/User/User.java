package Task23.User;

import Task23.Country;

import java.time.LocalDate;

public class User {
    private String email;
    private Country country;
    private LocalDate lastActiveTime;

    public String getEmail() {
        return email;
    }
    public Country getCountry() {
        return country;
    }
    public LocalDate getLastActiveTime() {
        return lastActiveTime;
    }

    public void sendTextMessage(String text) {
        System.out.println("Received text message: " + text);
    }
}
