package misc.domain;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class Student {
    @Size(max = 12)
    @Valid
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
