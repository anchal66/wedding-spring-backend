package com.weddings.weddingspring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Getter
@Setter
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "halls_id")
    private BanquetHalls banquetHalls;

    @ManyToOne
    @JoinColumn(name = "contents_id")
    private VendorContent vendorContent;

    public Comments(){}
}
