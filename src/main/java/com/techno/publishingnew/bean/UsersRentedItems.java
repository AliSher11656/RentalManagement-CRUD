package com.techno.publishingnew.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Component
@Entity
@Data
@Table(name = "users_rented_items", schema = "online_rental_management_system_db")
public class UsersRentedItems {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
//    @Basic
//    @Column(name = "user_id", nullable = false)
//    private Integer userId;
//    @Basic
//    @Column(name = "item_id", nullable = false)
//    private Integer itemId;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Users usersByUserId;
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private Items itemsByItemId;
}