package com.example.deliveryecommercebackend.model;


import jakarta.annotation.Resource;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.id.GUIDGenerator;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="user")
public class User {
    @Id
    @Column(name = "id")
    private int role_id;

    private String fullName;
    private String des;
    private Date created;
    private Date updated;
    private boolean isDelete;
    private String account;
    private String password;
    private String email;
    private String phone;
    private String purpose;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;



}
