package com.weddings.weddingspring.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vendor_content")
@Setter
@Getter
public class VendorContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Long contentId;

    @ManyToOne
    @JoinColumn(name = "vendors_id", nullable = false)
    private Vendor vendor;

    @Column(name = "content_name")
    private String contentName;

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

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "active")
    private boolean active;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendor_content")
    private Set<Comments> comments;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    public VendorContent() {
    }
}
