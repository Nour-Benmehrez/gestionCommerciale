package com.example.cepex4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Map;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Secteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sect_id;

    @NotBlank
    private String libelleS;
    @OneToMany(mappedBy = "secteur")
    @JsonIgnore
    private Set<Produit6c> produits6;
}
