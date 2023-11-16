package com.example.cepex4.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prd6_oper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long b_fabr;

    @NotBlank
    private String b_export;

    @NotBlank
    private String b_interet;

    @NotBlank
    private String b_import;

    @NotBlank
    private String marque;
}

