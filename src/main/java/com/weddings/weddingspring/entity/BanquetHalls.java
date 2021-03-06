package com.weddings.weddingspring.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "banquet_halls")
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "banquetHalls")
    private Set<Comments> comments;

    @Column(name = "banquet_name")
    private String banquetName;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "zip_code")
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
