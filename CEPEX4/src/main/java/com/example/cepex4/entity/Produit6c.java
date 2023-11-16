package com.example.cepex4.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produit6c {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prd6_id;

    @NotBlank
    private String libelleP;
    @NotBlank
    private String description;
@ManyToOne()
    private Secteur secteur;
}
