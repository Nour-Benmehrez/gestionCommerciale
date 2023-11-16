package com.example.cepex4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oper_sqid;

    @NotBlank
    @Size(max = 8)
    private String marticulefiscal;

  //  @NotBlank
    private String rsoc;

   // @NotBlank
    private String sigle;

   // @NotBlank
    @Size(max = 8)
    private String resid;

   // @NotBlank
    @Size(max = 8)
    private String adresse;

   // @NotBlank
    @Size(max = 8)
    private int ntel1;

   // @NotBlank
    @Size(max = 8)
    private int ntel2;

   // @NotBlank
    @Size(max = 50)
    //@Email
    private String email;

    private String refBnq;

  //  @NotBlank
    @Size(max = 8)
    private String url;

   // @NotBlank
    private String nomEmpl;

//    @NotBlank
    private String capsoc;

   // @NotBlank
    private String caexp;

   // @NotBlank
    private String d_etabl;

    //@NotBlank
    private String secteurs;

    @Enumerated(EnumType.STRING)
    Gouvernement1 gouvernement1;

    @Enumerated(EnumType.STRING)
    SecteurEnum secteurEnum;

    @OneToMany(mappedBy="operateur")
    @JsonIgnore
    private Set<Tiers> tiers;


}
