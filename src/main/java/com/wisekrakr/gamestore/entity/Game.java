package com.wisekrakr.gamestore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tbl_game")
@Setter
@Getter
@ToString
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String developer;
    @Column(name = "image_url")
    private String imageUrl;
    private boolean active;
    private BigDecimal price;
    @Column(name = "date_created")
    private Date createdOn;
    @Column(name = "last_updated")
    private Date updatedOn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private GameCategory category;
}
