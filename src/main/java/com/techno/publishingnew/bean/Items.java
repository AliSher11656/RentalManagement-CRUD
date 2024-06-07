package com.techno.publishingnew.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Component
@Entity
@Data
public class Items {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
//    @Basic
//    @Column(name = "user_id", nullable = false)
//    private Integer userId;
    @Basic
    @Column(name = "item_name", nullable = false, length = 191)
    private String itemName;
    @Basic
    @Column(name = "picture", nullable = false, length = 191)
    private String picture;
    @Basic
    @Column(name = "rental_price", nullable = false)
    private Integer rentalPrice;
    @Basic
    @Column(name = "description", nullable = false, length = 191)
    private String description;
    @Basic
    @Column(name = "keywords", nullable = false, length = 191)
    private String keywords;
    @Basic
    @Column(name = "status", nullable = false, length = 191)
    private String status;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Users usersByUserId;


}
