package com.example.deliveryecommercebackend.repository;

import com.example.deliveryecommercebackend.model.Role;
import com.example.deliveryecommercebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    User findUserByAccount(String account);
    @Query("SELECT u FROM User u WHERE u.user_id = :id")
    User findUserById(@Param("id") String id);
    User findUserByAccountAndPassword(String account, String password);
    User findUsersByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.role = :role AND u.is_delete = false")
    List<User> findUsersByRole(@Param("role") Role role);
    @Query("SELECT u FROM User u WHERE u.role = :role ANd u.code = :code AND u.is_delete = false")
    List<User> findNoneDeleteShipperByCode(@Param("code") String userCode, @Param("role") Role role);

    @Query("SELECT u FROM User u WHERE u.is_delete = false")
    List<User> findNoneDeleteUser();

    @Query("SELECT u FROM User u WHERE u.branch = :branchId AND u.is_delete = false")
    List<User> findUserByBranchId(@Param("branchId") String branchID);
}
