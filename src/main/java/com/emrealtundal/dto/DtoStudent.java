package com.emrealtundal.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {

    private Integer id;

    private String firstName;

    private String lastName;

    private List<DtoCourse> courses = new ArrayList<>();
}
