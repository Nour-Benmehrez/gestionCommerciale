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

public class Code_postal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_postal;

    @NotBlank
    private String libelle;
}
