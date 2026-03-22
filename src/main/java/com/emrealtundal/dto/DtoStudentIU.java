package com.emrealtundal.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Firstname alanı boş bırakılamaz!")
    @Size(min = 2, max = 30)
    private String firstName;

    @Size(min = 2, max = 30)
    private String lastName;

    private Date dateOfBirth;

    @Email(message = "Email formatında bir adres giriniz!")
    private String email;

    @Size(min = 11, max = 11, message = "TCKN 11 haneli olmalıdır!")
    @NotEmpty(message = "TCKN alanı boş geçilemez!")
    private String tckn;
}
