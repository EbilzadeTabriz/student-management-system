package net.javaguides.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "can not be empty")
    private String firstName;
    @NotEmpty(message = "can not be empty")
    private String lastName;
    @Email(message = "email should get in")
    @Size(min = 8,
    max = 15)
    private String email;

    // getter/setter methods
}
