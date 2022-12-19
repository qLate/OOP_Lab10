package Task23.User;

import Task23.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate getUserActiveTime;
}
