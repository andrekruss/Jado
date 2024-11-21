package br.com.kruss.jado.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.Instant;

public class CreateUserDTO {

    @NotNull(message = "Username can't be null.")
    private String username;

    @NotNull(message = "Email can't be null.")
    @Email(message = "Email must be valid.")
    private String email;

    @NotNull(message = "Password can't be null.")
    @Size(min = 8, message = "Password must have at least 8 characters.")
    private String password;

    public CreateUserDTO(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public @NotNull(message = "Username can't be null.") String getUsername() {
        return username;
    }

    public void setUsername(@NotNull(message = "Username can't be null.") String username) {
        this.username = username;
    }

    public @NotNull(message = "Email can't be null.") @Email(message = "Email must be valid.") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email can't be null.") @Email(message = "Email must be valid.") String email) {
        this.email = email;
    }

    public @NotNull(message = "Password can't be null.") @Size(min = 8, message = "Password must have at least 8 characters.") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "Password can't be null.") @Size(min = 8, message = "Password must have at least 8 characters.") String password) {
        this.password = password;
    }
}
