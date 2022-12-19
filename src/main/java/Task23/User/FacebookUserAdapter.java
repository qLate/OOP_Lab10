package Task23.User;

import Task23.Country;

import java.time.LocalDate;

public class FacebookUserAdapter extends User {
    private final FacebookUser user;
    public FacebookUserAdapter(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
    @Override
    public Country getCountry() {
        return user.getUserCountry();
    }
    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
