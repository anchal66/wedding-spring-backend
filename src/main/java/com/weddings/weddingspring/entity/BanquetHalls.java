package com.weddings.weddingspring.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "banquet_hall")
@Setter
@Getter
public class BanquetHalls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banquet_id")
    private Long banquetId;

    @ManyToOne
    @JoinColumn(name = "venues_id", nullable = false)
    private Venue venue;

    @Column(name = "banquet_name")
    private String banquetName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "zip")
    private Long zipCode;

    @Column(name = "old_price")
    private int oldPrice;

    @Column(name = "price")
    private int price;

    @Column(name = "intro")
    private String intro;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "areas")
    private int areas;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    public BanquetHalls() {
    }
}
