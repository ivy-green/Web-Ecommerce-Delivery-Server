package com.example.deliveryecommercebackend.model.user;

import com.example.deliveryecommercebackend.DTO.UserCreateDTO;
import jakarta.persistence.Entity;

@Entity
public class Staff extends User {
    @Override
    public void setDataCreate(UserCreateDTO userDTO) {
        super.setDataCreate(userDTO);
        this.setBranch(userDTO.getBranch());
    }
}
