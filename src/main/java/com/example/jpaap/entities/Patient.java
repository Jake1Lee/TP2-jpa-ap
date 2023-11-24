package com.example.jpaap.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOM",length = 50)
    private String nom;
    @Temporal(TemporalType.DATE) // par défaut c'est TIMESTAMP
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
