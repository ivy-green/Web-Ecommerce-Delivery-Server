package com.example.deliveryecommercebackend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import lombok.*;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity

@Table(name="store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String store_id;

    private String name;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String des;
    private boolean is_delete;
    private String address;
    private int state;
    private boolean is_default;
    private String phone;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonBackReference
    private User user;

}
