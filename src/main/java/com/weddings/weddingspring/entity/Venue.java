package com.weddings.weddingspring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="venue")
@Getter
@Setter
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venue_id")
    private Long venueId;

    @Column(name = "venue_name")
    private String  venueName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venue")
    private Set<BanquetHalls> banquetHalls;

    public Venue() {
    }
}
