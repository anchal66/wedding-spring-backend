package com.weddings.weddingspring.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "banquet-hall")
@Data
public class BanquetHalls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banquet-id")
    private Long banquetId;

    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

    @Column(name = "banquet-name")
    private String banquetName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "zip")
    private Long zipCode;

    @Column(name = "old-price")
    private int oldPrice;

    @Column(name = "price")
    private int price;

    @Column(name = "intro")
    private String intro;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "areas")
    private byte areas;

    @Column(name = "img-url")
    private String imgUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "date-created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last-updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
