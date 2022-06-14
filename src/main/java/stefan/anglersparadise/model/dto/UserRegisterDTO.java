package stefan.anglersparadise.model.dto;

import org.hibernate.validator.constraints.UniqueElements;
import stefan.anglersparadise.model.validation.PasswordsMatch;
import stefan.anglersparadise.model.validation.UniqueUserEmail;
import stefan.anglersparadise.model.validation.UniqueUsername;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@PasswordsMatch(
        first = "password",
        second = "confirmPassword",
        message = "Passwords do not match!"
)
public class UserRegisterDTO {

    @NotNull(message = "Username should be provided!")
    @Size(min = 3, max = 20, message = "Username should be between 3 and 20 symbols!")
    @UniqueUsername(message = "Username already taken!")
    private String username;

    @Email(message = "Enter a valid user email!")
    @NotBlank(message = "User email should be provided!")
    @UniqueUserEmail(message = "Email already taken!")
    private String email;

    @NotBlank(message = "First name is required!")
    private String firstName;

    @NotBlank(message = "Last name is required!")
    private String lastName;

    @NotBlank(message = "Password name is required!")
    @Size(min = 3, message = "Password must contain at least 3 symbols")
    private String password;

    private String confirmPassword;


    public String getUsername() {
        return username;
    }

    public UserRegisterDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
