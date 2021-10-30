package com.dailycodebuffer.SpringBoot.Tutorial.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;

    @NotBlank(message = "Please Add Department Name")
    /*@Length
    @Size
    @Email
    @Positive
    @Negative
    //...
    */
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
