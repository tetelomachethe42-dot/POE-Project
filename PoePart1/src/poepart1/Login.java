package poepart1;

public class Login extends Registration {

    public boolean loginUser(String firstName, String lastName) {

        if (firstName != null && !firstName.trim().isEmpty()
                && lastName != null && !lastName.trim().isEmpty()) {

            this.firstName = firstName;
            this.lastName = lastName;

            return true;
        }

        return false;
    }

    public String returnLoginStatus(boolean loginStatus) {

        if (loginStatus) {

            return "Welcome " + firstName + ", " + lastName
                    + ", it is great to see you.";

        } else {

            return "First name or last name incorrect, please try again.";
        }
    }
}