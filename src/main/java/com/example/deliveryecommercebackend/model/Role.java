package com.example.deliveryecommercebackend.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "name")
    private String name;

    @Column(name = "des")
    private String des;

//    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<User> users;
}
