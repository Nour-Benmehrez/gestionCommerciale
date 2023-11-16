package com.example.cepex4.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tiers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tiers_sqid;

    @NotBlank
    private String nom_prenom;

    @NotBlank
    private String adresse;

    @NotBlank
    @Size(max = 8)
    private int ntel1;

    @NotBlank
    @Size(max = 8)
    private int ntel2;

    @NotBlank
    @Size(max = 50)
    //@Email
    private String email;

    @NotBlank
    private String fonction;

    @ManyToOne
    Operateur operateur;
}
