package compinator;

import java.time.LocalDate;

/**
 * @author tapiwanashem
 * @Date 30/3/2021
 * @Time 13:32
 * @Year 2021
 */
public class Customer {

    private final String name;
    private final String email;
    private final String phoneNUmber;
    private final LocalDate dateOfBirth;


    public Customer(String name, String email, String phoneNUmber, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNUmber = phoneNUmber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
