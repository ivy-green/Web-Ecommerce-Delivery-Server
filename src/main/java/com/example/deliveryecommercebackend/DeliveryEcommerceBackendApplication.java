package com.example.deliveryecommercebackend;

import com.example.deliveryecommercebackend.model.Action;
import com.example.deliveryecommercebackend.model.Bank;
import com.example.deliveryecommercebackend.model.Role;
import com.example.deliveryecommercebackend.model.User;
import com.example.deliveryecommercebackend.repository.ActionRepository;
import com.example.deliveryecommercebackend.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication

public class DeliveryEcommerceBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryEcommerceBackendApplication.class, args);
    }

    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private ActionRepository actionRepository;

    @Override
    public void run(String... args) throws Exception {
        Bank newBank = new Bank();
        newBank.setBank_id("bank1");
        newBank.setName("EXIMBANK");
        newBank.setState(false);
        bankRepository.save(newBank);

        Bank newBank1 = new Bank();
        newBank1.setBank_id("bank2");
        newBank1.setName("TPBANK");
        newBank1.setState(false);
        bankRepository.save(newBank1);


        Bank newBank2 = new Bank();
        newBank2.setBank_id("bank3");
        newBank2.setName("TECHCOMBANK");
        newBank2.setState(false);
        bankRepository.save(newBank2);

//        Action action = new Action();
//        action.setAction_id(0);
//        action.setName("waiting");
//        action.setDes("waiting for accepting");
//        action.setType("admin");
//        action.set_deleted(false);
//        action.setCreated(Date.valueOf(LocalDate.now()));
//
//        actionRepository.save(action);
//
//        Action action1 = new Action();
//        action1.setAction_id(1);
//        action1.setName("accept");
//        action1.setDes("accepted");
//        action1.setType("admin");
//        action1.set_deleted(false);
//        action1.setCreated(Date.valueOf(LocalDate.now()));
//
//        actionRepository.save(action1);
//
//        Action action2 = new Action();
//        action2.setAction_id(2);
//        action2.setName("decline");
//        action2.setDes("decline");
//        action2.setType("admin");
//        action2.set_deleted(false);
//        action2.setCreated(Date.valueOf(LocalDate.now()));
//
//        actionRepository.save(action2);

    }
}
