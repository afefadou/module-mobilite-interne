package org.modulemob.postesservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter @ToString

public class Poste {
    @Id
    private String id;
    private String titre;
    private String description;
    private boolean status;
    private Date creationDate;
    private Date closureDate;
    private double salary;
    private String contractType;
    private String team;

}
