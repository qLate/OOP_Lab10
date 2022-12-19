package Task23.User;

import Task23.Country;

import java.time.LocalDate;

public class TwitterUserAdapter extends User {
    private final TwitterUser user;
    public TwitterUserAdapter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }
    @Override
    public Country getCountry() {
        return Enum.valueOf(Country.class, user.getCountry());
    }
    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
