package com.techno.publishingnew.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Component
@Entity
@Data
public class Users {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 191)
    private String name;
    @Basic
    @Column(name = "phone_no", nullable = false, length = 191)
    private String phoneNo;
    @Basic
    @Column(name = "email", nullable = false, length = 191)
    private String email;
    @Basic
    @Column(name = "password", nullable = false, length = 191)
    private String password;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
//    @OneToMany(mappedBy = "usersByUserId")
//    private Collection<Items> itemsById;
//    @OneToMany(mappedBy = "usersByUserId")
//    private Collection<UsersRentedItems> usersRentedItemsById;
//    @OneToMany(mappedBy = "usersByUserId")
//    private Collection<UsersRequestedItems> usersRequestedItemsById;

}
