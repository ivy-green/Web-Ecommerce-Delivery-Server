package com.example.deliveryecommercebackend.repository;

import com.example.deliveryecommercebackend.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface VoucherRepository extends JpaRepository<Voucher, String> {
    //crud method
//    Voucher findVoucherById(String voucher_id);

}
