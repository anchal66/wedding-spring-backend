package com.weddings.weddingspring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="vendor")
@Getter
@Setter
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    private Long venueId;

    @Column(name = "vendor_name")
    private String  venueName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor")
    private Set<BanquetHalls> banquetHalls;

    public Vendor() {
    }
}
